package com.learndr.learndr.vocabulary.application.dto.command;

public record AddWordCommand(
    String word,
    String meaning,
    String context) {
}
