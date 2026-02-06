package com.learndr.learndr.vocabulary.infrastructure.persistance;
import jakarta.persistence.*;

import com.learndr.learndr.vocabulary.domain.entity.Word;

@Entity
@Table(name = "words", schema="schema_vocabulary")
public class WordJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_word")
    private Long id;

    @Column(nullable = false)
    private String word;

    @Column(nullable = false)
    private String meaning;
    
    @Column
    private String context;
    
    @Column
    private int learn_progress_percentage=0;

    protected WordJpaEntity() {
    }

    public WordJpaEntity(String word, String meaning, String context) {
        this.word = word;
        this.meaning = meaning;
        this.context = context;
    }
    public WordJpaEntity(String word, String meaning, String context, int learn_progress_percentage) {
        this.word = word;
        this.meaning = meaning;
        this.context = context;
        this.learn_progress_percentage = learn_progress_percentage;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getContext() {
        return context;
    }

    public int getLearn_progress_percentage() {
        return learn_progress_percentage;
    }

    
}
