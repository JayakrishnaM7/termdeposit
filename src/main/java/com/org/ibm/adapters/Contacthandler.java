package com.org.ibm.adapters;


import com.org.ibm.restprocessors.impl.*;
import com.org.ibm.restutility.Utility;
import com.org.ibm.model.error.ApiError;
import com.org.ibm.model.error.GenericError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Contacthandler implements JavaDelegate{

    @Autowired
    private Utility utility;

    @Autowired
    private ContacthandlerRestProcessor restProcessor;

    private final static Logger LOGGER = Logger.getLogger(Contacthandler.class.getName());

     @Override
    public void execute(DelegateExecution execution) throws Exception {
         LOGGER.info("Adapter execution started");
         String request = (String) execution.getVariable("jsonRequest");
         Object response = utility.processMsg(request, restProcessor);
         if(response instanceof ApiError ||  response instanceof GenericError){
            //Failure Path
            throw new RuntimeException("Error occurred in the adapter:"+Contacthandler.class.getName());
         }else{
            //success Path - enrich or transform the respone object here
         }
    }

}
