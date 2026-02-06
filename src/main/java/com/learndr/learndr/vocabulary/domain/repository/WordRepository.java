package com.learndr.learndr.vocabulary.domain.repository;

import com.learndr.learndr.vocabulary.domain.entity.Word;

public interface WordRepository {
  void save(Word word);  
}
