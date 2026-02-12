package com.learndr.learndr.vocabulary.application.command;

import java.time.Instant;

public record WordOutputCommand(
    Long id,
    String word,
    String meaning,
    String context,
    int learnProgressPercentage,
    boolean isLearned,
    Instant createdAt) {
  public WordOutputCommand(
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
