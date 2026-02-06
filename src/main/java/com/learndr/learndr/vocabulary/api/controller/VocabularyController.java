package com.learndr.learndr.vocabulary.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

// import com.learndr.learndr.vocabulary.api.dto.CreateWordRequestDTO;
import com.learndr.learndr.vocabulary.application.command.AddWordCommand;
import com.learndr.learndr.vocabulary.application.usecase.AddWordUseCase;
import com.learndr.learndr.vocabulary.api.dto.*;;

@Controller
public class VocabularyController {
  @GetMapping("/vocabulary")
  public String vocabulary() {
    return "vocabulary/vocab-list";
  }

  private final AddWordUseCase AddWordUseCase;

  public VocabularyController(AddWordUseCase AddWordUseCase) {
    this.AddWordUseCase = AddWordUseCase;
  }

  @PostMapping("/api/words")
  // public ResponseEntity<CreateWordResponseDTO> addWord(@Valid @RequestBody CreateWordRequestDTO req) {
  public ResponseEntity<Void> addWord(@Valid @RequestBody CreateWordRequestDTO req) {
    AddWordUseCase.execute(
        new AddWordCommand(req.word(), req.meaning(), req.context())
      );

    //   CreateWordResponseDTO created = 

    // return ResponseEntity.status(HttpStatus.CREATED).body(created);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}

// TODO: make controller return response to show added word immediately without page refresh