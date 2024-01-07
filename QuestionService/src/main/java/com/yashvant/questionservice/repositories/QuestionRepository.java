package com.yashvant.questionservice.repositories;

import com.yashvant.questionservice.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
