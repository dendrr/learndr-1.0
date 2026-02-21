package com.learndr.learndr.vocabulary.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learndr.learndr.vocabulary.infrastructure.persistence.entity.WordJpaEntity;

public interface SpringDataWordRepository extends JpaRepository<WordJpaEntity, Long> {
  
}
