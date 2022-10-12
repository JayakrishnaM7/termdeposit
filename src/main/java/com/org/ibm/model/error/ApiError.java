package com.org.ibm.model.error;

import org.springframework.http.HttpStatus;

public class ApiError extends GenericError {

    private HttpStatus status;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

}
