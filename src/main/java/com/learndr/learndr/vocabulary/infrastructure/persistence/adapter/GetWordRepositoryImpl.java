package com.learndr.learndr.vocabulary.infrastructure.persistence.adapter;

import com.learndr.learndr.vocabulary.application.dto.query.GetWordsPageQuery;
import com.learndr.learndr.vocabulary.application.dto.result.WordsPageResponse;
import com.learndr.learndr.vocabulary.application.port.out.WordQueryPort;
import com.learndr.learndr.vocabulary.infrastructure.repository.JpaWordRepository;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class GetWordRepositoryImpl implements WordQueryPort {
  private final JpaWordRepository jpa;

  public GetWordRepositoryImpl(JpaWordRepository jpa) {
    this.jpa = jpa;
  }

  @Override
  public WordsPageResponse getWordsPage(GetWordsPageQuery query) {
    var pageable = PageRequest.of(query.page(), query.size(), Sort.by(Sort.Direction.DESC, "createdAt"));

    List<Wor
  }
}
