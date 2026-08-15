package com.learndr.learndr.auth.application.exception;

public class EmailAlreadyExistException extends RuntimeException {
  public EmailAlreadyExistException(String email) {
    super("The email " + email + " is already used");
  }
}
