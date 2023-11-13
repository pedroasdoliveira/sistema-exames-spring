package com.sistema.exames.services;

import com.sistema.exames.entities.Exam;

import java.util.Set;

public interface ExamService {

    Exam createExam(Exam exam);

    Exam updateExam(Exam exam);

    Set<Exam> getAllExams();

    Exam getExam(Long examId);

    void deleteExam(Long examId);
}
