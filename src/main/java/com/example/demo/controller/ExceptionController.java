package com.example.demo.controller;

import com.example.demo.exception.ExceptionMessages;
import com.example.demo.exception.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping(path = "sampleException")
    public ResponseEntity<String> sampleException() throws ValidationException {
        if(1==1)
            throw new ValidationException(ExceptionMessages.MissingNameException);

        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }
}
