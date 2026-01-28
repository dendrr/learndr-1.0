-- schema
CREATE    SCHEMA IF NOT EXISTS schema_vocabulary;

DROP      TABLE IF EXISTS schema_vocabulary.words;

-- roles
CREATE    TABLE IF NOT EXISTS schema_vocabulary.words (
          id_word INTEGER GENERATED ALWAYS AS IDENTITY (INCREMENT BY 1) PRIMARY KEY,
          word TEXT NOT NULL,
          meaning TEXT NOT NULL,
          context TEXT,
          next_review_at timestamptz,
          repetition_count INTEGER DEFAULT 0,
          learn_progress_percent INTEGER DEFAULT 0,
          is_learned BOOLEAN DEFAULT FALSE,
          CONSTRAINT word_progress_percent CHECK (
          (NOT is_learned)
OR        (learn_progress_percent = 100)
          ),
          created_at timestamptz DEFAULT NOW(),
          review_lapse_count INTEGER DEFAULT 0
          );