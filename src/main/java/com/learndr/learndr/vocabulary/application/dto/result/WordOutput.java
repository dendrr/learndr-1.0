package com.learndr.learndr.vocabulary.application.dto.result;

import java.time.Instant;

public record WordOutput(
    Long id,
    String word,
    String meaning,
    String context,
    int learnProgressPercentage,
    boolean isLearned,
    Instant createdAt) {
  public WordOutput(
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
