package com.learndr.learndr.vocabulary.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learndr.learndr.vocabulary.infrastructure.persistence.WordJpaEntity;

public interface JpaWordRepository extends JpaRepository<WordJpaEntity, Long> {
  
}
