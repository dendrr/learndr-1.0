package com.learndr.learndr.auth.infrastructure.exceptions.dto;

public record ApiError(
  String code,
  String message
){}
