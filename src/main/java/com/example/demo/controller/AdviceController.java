package com.example.demo.controller;

import com.example.demo.exception.ExceptionModel;
import com.example.demo.exception.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class AdviceController extends ResponseEntityExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(AdviceController.class);

    @ExceptionHandler(ValidationException.class)
    public final ResponseEntity<ExceptionModel> handleBusinessException(ValidationException ex) {
        logger.error("BusinessException from AdviceController", ex);
        logger.debug("Exception from AdviceController message: {}", ex.getMessage());

        return new ResponseEntity<>(new ExceptionModel(ex.getCode(),ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
