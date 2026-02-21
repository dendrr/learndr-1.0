package com.learndr.learndr.vocabulary.api.dto.response;

import java.time.Instant;

public record WordResponseDTO(
    Long id,
    String word,
    String meaning,
    String context,
    int learnProgressPercentage,
    boolean isLearned,
    Instant createdAt) {
  public WordResponseDTO(
      Long id,
      String word,
      String meaning,
      String context,
      int learnProgressPercentage,
      boolean isLearned,
      Instant createdAt) {
    this.id = id;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learnProgressPercentage = learnProgressPercentage;
    this.isLearned = isLearned;
    this.createdAt = createdAt;
  }
}
