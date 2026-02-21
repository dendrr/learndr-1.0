package com.learndr.learndr.vocabulary.api.mapper;

import com.learndr.learndr.vocabulary.api.dto.response.WordResponseDTO;
import com.learndr.learndr.vocabulary.application.dto.result.WordOutput;

public class WordApiMapper {
  public static WordResponseDTO toWordResponseDTO(WordOutput res) {
    return new WordResponseDTO(
        res.id(),
        res.word(),
        res.meaning(),
        res.context(),
        res.learnProgressPercentage(),
        res.isLearned(),
        res.createdAt());
  }
}