package com.learndr.learndr.vocabulary.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

import com.learndr.learndr.vocabulary.application.command.AddWordCommand;
import com.learndr.learndr.vocabulary.application.command.WordOutputCommand;
import com.learndr.learndr.vocabulary.application.usecase.AddWordUseCase;
import com.learndr.learndr.vocabulary.api.dto.*;
import com.learndr.learndr.vocabulary.api.mapper.*;;

@Controller
public class VocabularyController {
  @GetMapping("/vocabulary")
  public String vocabulary() {
    return "vocabulary/vocab-list";
  }

  // // TODO: @GetMapping("/api/words") public ResponseEntity<
  // @GetMapping("/api/words")
  // public ResponseEntity<List<WordResponseDTO>> getWords() { 
  
  // }

  private final AddWordUseCase AddWordUseCase;

  public VocabularyController(AddWordUseCase AddWordUseCase) {
    this.AddWordUseCase = AddWordUseCase;
  }

  @PostMapping("/api/words")
  public ResponseEntity<WordResponseDTO> addWord(@Valid @RequestBody CreateWordRequestDTO req) {
      AddWordCommand command = new AddWordCommand(
                req.word(),
                req.meaning(),
                req.context()
        );

        WordOutputCommand output = AddWordUseCase.execute(command);

        WordResponseDTO response = WordApiMapper.toWordResponseDTO(output);

        return ResponseEntity.ok(response);
  }
}
