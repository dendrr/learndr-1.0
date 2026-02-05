package com.learndr.learndr.vocabulary.application.usecase;

import com.learndr.learndr.vocabulary.application.command.AddWordCommand;

public interface AddWordUseCase {
  void execute(AddWordCommand cmd);
}
