package com.learndr.learndr.vocabulary.application.port.in;

import com.learndr.learndr.vocabulary.application.dto.command.*;
import com.learndr.learndr.vocabulary.application.dto.result.*;

public interface AddWordUseCase {
  WordOutput execute(AddWordCommand cmd);
}
