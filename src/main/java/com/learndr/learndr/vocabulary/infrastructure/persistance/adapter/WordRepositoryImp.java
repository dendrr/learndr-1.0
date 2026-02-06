package com.learndr.learndr.vocabulary.infrastructure.persistance.adapter;

import org.springframework.stereotype.Repository;

import com.learndr.learndr.vocabulary.domain.entity.Word;
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
  public void save(Word word) {
    WordJpaEntity entity = new WordJpaEntity(
      word.getWord(), 
      word.getMeaning(), 
      word.getContext());

      jpaWordRepository.save(entity);
  }
}
