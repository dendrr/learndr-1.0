package com.learndr.learndr.vocabulary.domain.entity;

public class Word {
  private String word;
  private String meaning;
  private String context;
  private int learnProgressPercentage;

  public Word(String word, String meaning, String context) {
    this.word = word;
    this.meaning = meaning;
    this.context = context;
  }

  public String getWord() {
    return word;
  }
  public String getMeaning() {
    return meaning;
  }
  public String getContext() {
    return context;
  }
}
