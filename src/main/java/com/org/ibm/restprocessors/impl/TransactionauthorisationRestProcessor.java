package com.org.ibm.restprocessors.impl;

import com.org.ibm.restprocessors.RestApiInterface;
import com.org.ibm.restutility.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.HttpClientErrorException;
import com.org.ibm.model.error.ApiError;
import com.org.ibm.model.error.GenericError;
import org.springframework.http.HttpStatus;
import java.io.IOException;
import java.time.LocalDateTime;



import java.net.URI;

@Service
public class TransactionauthorisationRestProcessor implements RestApiInterface {
	private static final Logger logger = LoggerFactory.getLogger(TransactionauthorisationRestProcessor.class);

    @Autowired
	private Utility utility;

	@Value("${spring.api.transactionauthorisation.hosturl}")
	private String url;
	
	@Value("${spring.api.transactionauthorisation.context-path}")
	private String contextPath;

	@Value("${spring.api.transactionauthorisation.jolt-filename}")
    private String joltFileName;
	
	@Override
	public RequestEntity<Object> preProcessor(String requestObj)  throws IOException {

		logger.debug("Entering into preProcessor method");
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.add("Content-Type", "application/json");
		HttpMethod verb = HttpMethod.POST;
		String body = utility.transformRequestUsingJOLT(requestObj,joltFileName);

		//TODO //NOSONAR
		// construct body, convert into String and set required headers
		return new RequestEntity(body,headers,verb,URI.create(url+contextPath),String.class);
	}
	
	@Override
	public String postProcessor(String requestObj, ResponseEntity<Object> responseEntity){//NOSONAR
		//TODO //NOSONAR

		Object obj = responseEntity.getBody();
		return obj.toString();
	}
	
	@Override
	public Object exceptionMessage(Exception e, String requestObj) {//NOSONAR
        GenericError error = new GenericError();
		if(e instanceof  HttpClientErrorException){
			if(((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.NOT_FOUND) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.BAD_REQUEST) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.UNAUTHORIZED) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.FORBIDDEN) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.PRECONDITION_FAILED) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.INTERNAL_SERVER_ERROR) ||
					((HttpClientErrorException) e).getStatusCode().equals(HttpStatus.SERVICE_UNAVAILABLE)){

				ApiError apiError  = new ApiError();
				apiError.setStatus(((HttpClientErrorException) e).getStatusCode());
				apiError.setMessage("API called failed in " +  TransactionauthorisationRestProcessor.class.getName());
				apiError.setDebugMessage(e.getMessage());
				apiError.setTimestamp(LocalDateTime.now());
				logger.info(apiError.getDebugMessage() + apiError.getMessage());
				return apiError;
			}
		} else {
			error.setMessage("Error occurred in "+ TransactionauthorisationRestProcessor.class.getName());
			error.setDebugMessage(e.getMessage());
			error.setTimestamp(LocalDateTime.now());
			logger.info(error.getDebugMessage() + error.getMessage());
			return error;
		}
		return error;
	}
}