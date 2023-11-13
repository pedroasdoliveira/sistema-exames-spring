package com.sistema.exames.services;

import com.sistema.exames.entities.Exam;
import com.sistema.exames.entities.Question;

import java.util.Set;

public interface QuestionService {

    Question createQuestion(Question question);

    Question updateQuestion(Question question);

    Set<Question> getAllQuestions();

    Question getQuestion(Long questionId);

    Set<Question> getQuestionForExam(Exam exam);

    void deleteQuestion(Long questionId);
}
