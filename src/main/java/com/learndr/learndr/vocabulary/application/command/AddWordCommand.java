package com.learndr.learndr.vocabulary.application.command;

public record AddWordCommand(
    String word,
    String meaning,
    String context) {
}
