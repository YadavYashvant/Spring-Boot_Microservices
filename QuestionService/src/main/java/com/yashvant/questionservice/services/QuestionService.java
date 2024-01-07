package com.yashvant.questionservice.services;


import com.yashvant.questionservice.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create( Question question );

    List<Question> get();

    Question getOne(Long id);
}
