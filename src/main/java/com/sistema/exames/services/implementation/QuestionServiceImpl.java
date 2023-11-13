package com.sistema.exames.services.implementation;

import com.sistema.exames.entities.Exam;
import com.sistema.exames.entities.Question;
import com.sistema.exames.repositories.QuestionRepository;
import com.sistema.exames.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Set<Question> getAllQuestions() {
        return (Set<Question>) questionRepository.findAll();
    }

    @Override
    public Question getQuestion(Long questionId) {
        return questionRepository.findById(questionId).get();
    }

    @Override
    public Set<Question> getQuestionForExam(Exam exam) {
        return questionRepository.findByExam(exam);
    }

    @Override
    public void deleteQuestion(Long questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);

        questionRepository.delete(question);
    }
}
