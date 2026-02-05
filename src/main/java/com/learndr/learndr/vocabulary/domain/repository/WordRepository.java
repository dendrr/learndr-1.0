package com.learndr.learndr.vocabulary.domain.repository;

import com.learndr.learndr.vocabulary.domain.entity.VocabWord;

public interface WordRepository {
  void save(VocabWord word);  
}
