package com.learndr.learndr.auth.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learndr.learndr.auth.application.exception.EmailAlreadyExistException;
import com.learndr.learndr.auth.infrastructure.exceptions.dto.ApiError;

@RestControllerAdvice
public class GlobalHandlerException {
  @ExceptionHandler(EmailAlreadyExistException.class)
  public ResponseEntity<ApiError> handleEmailAlreadyExistException(
    EmailAlreadyExistException exception
  ){
    ApiError error = new ApiError(
      "EMAIL_ALREADY_USED",
      exception.getMessage()
    );
    return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
  }
}
