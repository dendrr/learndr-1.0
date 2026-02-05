package com.learndr.learndr.vocabulary.api.dto;

public record CreateWordResponseDTO(
    Long id,
    String word,
    String meaning,
    String context,
    int learnProgressPercentage) {
}
