package com.learndr.learndr.vocabulary.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

import com.learndr.learndr.vocabulary.application.dto.command.*;
import com.learndr.learndr.vocabulary.application.dto.result.*;
import com.learndr.learndr.vocabulary.application.dto.query.*;
import com.learndr.learndr.vocabulary.application.port.in.*;
import com.learndr.learndr.vocabulary.application.service.GetWordsPageService;
// import com.learndr.learndr.vocabulary.application.port.out.*;
import com.learndr.learndr.vocabulary.api.dto.request.*;
import com.learndr.learndr.vocabulary.api.dto.response.*;
import com.learndr.learndr.vocabulary.api.mapper.*;;

@Controller
public class VocabularyController {
  private final AddWordUseCase AddWordUseCase;

  public VocabularyController(AddWordUseCase AddWordUseCase) {
    this.AddWordUseCase = AddWordUseCase;
  }

  @GetMapping("/vocabulary")
  public String vocabulary() {
    return "vocabulary/vocab-list";
  }

  @GetMapping("/api/words")
  public ResponseEntity<List<WordResponseDTO>> getWords(
    @RequestParam int page,
    @RequestParam int size,
    @RequestParam String sort) {
      GetWordsPageQuery query = new GetWordsPageQuery(page, size, sort);
      WordsPageResponse response = GetWordsPageService.execute(query);
  }


  @PostMapping("/api/words")
  public ResponseEntity<WordResponseDTO> addWord(@Valid @RequestBody CreateWordRequestDTO req) {
      AddWordCommand command = new AddWordCommand(
                req.word(),
                req.meaning(),
                req.context()
        );

        WordOutput output = AddWordUseCase.execute(command);

        WordResponseDTO response = WordApiMapper.toWordResponseDTO(output);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
}
