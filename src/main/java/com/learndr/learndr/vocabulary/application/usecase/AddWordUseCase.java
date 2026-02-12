package com.learndr.learndr.vocabulary.application.usecase;

import com.learndr.learndr.vocabulary.application.command.*;

public interface AddWordUseCase {
  WordOutputCommand execute(AddWordCommand cmd);
}
