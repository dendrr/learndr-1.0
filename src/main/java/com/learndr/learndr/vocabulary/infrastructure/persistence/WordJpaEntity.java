package com.learndr.learndr.vocabulary.infrastructure.persistence;

import jakarta.persistence.*;

import java.time.OffsetDateTime;

import org.hibernate.annotations.DynamicInsert;

@DynamicInsert
@Entity
@Table(name = "words", schema = "schema_vocabulary")
public class WordJpaEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_word")
  private Long id_word;

  @Column(nullable = false)
  private String word;

  @Column(nullable = false)
  private String meaning;

  @Column
  private String context;

  @Column
  private OffsetDateTime next_review_at;

  @Column
  private Integer learn_progress_percentage;

  @Column
  private Integer repetition_count;

  @Column
  private Boolean is_learned;

  @Column
  private Integer review_lapse_count;

  @Column(updatable = false, insertable = false)
  private OffsetDateTime created_at;

  protected WordJpaEntity() {
  }

  public WordJpaEntity(String word, String meaning, String context) {
    this.word = word;
    this.meaning = meaning;
    this.context = context;
  }

  public WordJpaEntity(Long id_word, String word, String meaning, String context) {
    this.id_word = id_word;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
  }

  public WordJpaEntity(Long id_word, String word, String meaning, String context, int learn_progress_percentage) {
    this.id_word = id_word;
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learn_progress_percentage = learn_progress_percentage;
  }

  public WordJpaEntity(String word, String meaning, String context, int learn_progress_percentage) {
    this.word = word;
    this.meaning = meaning;
    this.context = context;
    this.learn_progress_percentage = learn_progress_percentage;
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

  public int getLearn_progress_percentage() {
    return learn_progress_percentage;
  }

  public Long getId() {
    return id_word;
  }

}
