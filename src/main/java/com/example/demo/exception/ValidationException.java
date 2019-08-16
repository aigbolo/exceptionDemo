package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationException extends Exception {

	private String code;

	public ValidationException(ExceptionMessages exceptionMessages) {
		super(exceptionMessages.message);
		this.setCode(exceptionMessages.code);
	}
}

