package com.learndr.learndr.vocabulary.application.usecase;

import org.springframework.stereotype.Service;
import com.learndr.learndr.vocabulary.application.command.AddWordCommand;
import com.learndr.learndr.vocabulary.domain.repository.WordRepository;
import com.learndr.learndr.vocabulary.domain.entity.Word;

@Service
public class AddWordService implements AddWordUseCase {
  private final WordRepository wordRepository;

  public AddWordService(WordRepository wordRepository) {
    this.wordRepository = wordRepository;
  }

  @Override
  public void execute(AddWordCommand cmd) {
    Word word = new Word(
        cmd.word(),
        cmd.meaning(),
        cmd.context());
    wordRepository.save(word);
  }
}
