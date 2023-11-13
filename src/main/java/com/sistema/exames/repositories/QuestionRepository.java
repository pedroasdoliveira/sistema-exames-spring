package com.sistema.exames.repositories;

import com.sistema.exames.entities.Exam;
import com.sistema.exames.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Set<Question> findByExam(Exam exam);
}
