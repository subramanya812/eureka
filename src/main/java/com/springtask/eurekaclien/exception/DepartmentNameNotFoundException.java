package com.springtask.eurekaclien.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no such departmentname")
public class DepartmentNameNotFoundException extends RuntimeException {

    public DepartmentNameNotFoundException(String message) {
        super(message);
    }
}
