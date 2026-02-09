package com.learndr.learndr.vocabulary.domain.entity;

public class Word {
  private final WordId id;
  private String word;
  private String meaning;
  private String context;
  private int learnProgressPercentage;

  public Word(String word, String meaning, String context) {
    this.id = null;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learnProgressPercentage = 0;
  }

  public Word(WordId id, String word, String meaning, String context) {
    this.id = id;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learnProgressPercentage = 0;
  }

  public Word(WordId id, String word, String meaning, String context, int learnProgressPercentage) {
    this.id = id;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learnProgressPercentage = learnProgressPercentage;
  }

  public WordId getId() {
    return id;
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

  public int getLearnProgressPercentage() {
    return learnProgressPercentage;
  }
}
