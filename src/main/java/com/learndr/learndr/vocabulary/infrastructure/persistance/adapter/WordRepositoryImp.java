package com.learndr.learndr.vocabulary.infrastructure.persistance.adapter;

import org.springframework.stereotype.Repository;

import com.learndr.learndr.vocabulary.domain.entity.Word;
import com.learndr.learndr.vocabulary.domain.entity.WordId;
import com.learndr.learndr.vocabulary.domain.repository.WordRepository;
import com.learndr.learndr.vocabulary.infrastructure.persistance.WordJpaEntity;
import com.learndr.learndr.vocabulary.infrastructure.repository.JpaWordRepository;


@Repository
public class WordRepositoryImp implements WordRepository {
  private final JpaWordRepository jpaWordRepository;

  public WordRepositoryImp(JpaWordRepository jpaWordRepository) {
    this.jpaWordRepository = jpaWordRepository;
  }

  @Override
  public WordId save(Word word) {
    WordJpaEntity entity;
    if (word.getId() == null) {
      entity = new WordJpaEntity(
          word.getWord(),
          word.getMeaning(),
          word.getContext(),
          word.getLearnProgressPercentage());
    } else {
      entity = new WordJpaEntity(
          word.getId().value(),
          word.getWord(),
          word.getMeaning(),
          word.getContext(),
          word.getLearnProgressPercentage());
    }

    WordJpaEntity saved = jpaWordRepository.save(entity);
    return new WordId(saved.getId());
  }
}
