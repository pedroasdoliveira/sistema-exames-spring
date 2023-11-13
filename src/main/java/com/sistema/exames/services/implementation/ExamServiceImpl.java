package com.sistema.exames.services.implementation;

import com.sistema.exames.entities.Exam;
import com.sistema.exames.repositories.ExamRepository;
import com.sistema.exames.services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam updateExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Set<Exam> getAllExams() {
        return new LinkedHashSet<>(examRepository.findAll());
    }

    @Override
    public Exam getExam(Long examId) {
        return examRepository.findById(examId).get();
    }

    @Override
    public void deleteExam(Long examId) {
        Exam exam = new Exam();
        exam.setExamId(examId);

        examRepository.delete(exam);
    }
}
