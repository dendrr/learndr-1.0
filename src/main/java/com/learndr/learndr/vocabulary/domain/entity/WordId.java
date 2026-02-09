package com.learndr.learndr.vocabulary.domain.entity;

public final class WordId {
  private final Long value;

  public WordId(Long value) {
    this.value = java.util.Objects.requireNonNull(value, "WordId value cannot be null");
    if (value <= 0) {
      throw new IllegalArgumentException("WordId value must be positive");
    }
  }

  public Long value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof WordId)) return false;
    WordId other = (WordId) o;
    return value.equals(other.value);
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  @Override
  public String toString() {
    return "WordId{" + "value=" + value + '}';
  }
}
