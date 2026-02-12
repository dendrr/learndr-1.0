package com.learndr.learndr.vocabulary.api.mapper;

import com.learndr.learndr.vocabulary.api.dto.WordResponseDTO;
import com.learndr.learndr.vocabulary.application.command.WordOutputCommand;

public class WordApiMapper {
  public static WordResponseDTO toWordResponseDTO(WordOutputCommand cmd) {
    return new WordResponseDTO(
        cmd.id(),
        cmd.word(),
        cmd.meaning(),
        cmd.context(),
        cmd.learnProgressPercentage(),
        cmd.isLearned(),
        cmd.createdAt());
  }
}