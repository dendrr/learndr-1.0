package com.learndr.learndr.vocabulary.domain.repository;

import com.learndr.learndr.vocabulary.domain.entity.Word;
import com.learndr.learndr.vocabulary.domain.entity.WordId;

public interface WordRepository {
  WordId save(Word word);
}
