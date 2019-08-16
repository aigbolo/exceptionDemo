package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionModel {
    private String code;
    private String message;

    public ExceptionModel(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
