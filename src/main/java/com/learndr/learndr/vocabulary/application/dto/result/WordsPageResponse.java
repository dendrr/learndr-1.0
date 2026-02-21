package com.learndr.learndr.vocabulary.application.dto.result;
import java.util.List;

public record WordsPageResponse(
    List<WordOutput> words,
    int page,
    int size,
    long totalElements
) {
  public int getTotalPages() {
    return (int)Math.ceil((double) totalElements /(double) size);
  }
}
