package com.learndr.learndr.vocabulary.application.port.out;

import com.learndr.learndr.vocabulary.application.dto.query.GetWordsPageQuery;
import com.learndr.learndr.vocabulary.application.dto.result.WordsPageResponse;

public interface WordQueryPort {
    WordsPageResponse getWordsPage(GetWordsPageQuery query);
}
