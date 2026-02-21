package com.learndr.learndr.vocabulary.api.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CreateWordRequestDTO(
    @NotBlank String word,
    @NotBlank String meaning,
    String context) {
}