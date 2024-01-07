package com.yashvant.questionservice.services.impl;

import com.yashvant.questionservice.entities.Question;
import com.yashvant.questionservice.repositories.QuestionRepository;
import com.yashvant.questionservice.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return null;
    }

    @Override
    public List<Question> get() {
        return null;
    }

    @Override
    public Question getOne(Long id) {
        return null;
    }
}
