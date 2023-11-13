package com.sistema.exames.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "exames")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;

    private String title;
    private String description;
    private String maxPoints;
    private String numberOfQuestions;
    private boolean active = false;

    @ManyToOne(fetch = FetchType.EAGER)
    private Categorie categorie;

    @OneToMany(mappedBy = "exam", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Question> questions = new HashSet<>();

    public Exam() {}

    public Exam(Long examId, String title, String description, String maxPoints, String numberOfQuestions, boolean active, Categorie categorie, Set<Question> questions) {
        this.examId = examId;
        this.title = title;
        this.description = description;
        this.maxPoints = maxPoints;
        this.numberOfQuestions = numberOfQuestions;
        this.active = active;
        this.categorie = categorie;
        this.questions = questions;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(String maxPoints) {
        this.maxPoints = maxPoints;
    }

    public String getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(String numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return active == exam.active && Objects.equals(examId, exam.examId) && Objects.equals(title, exam.title) && Objects.equals(description, exam.description) && Objects.equals(maxPoints, exam.maxPoints) && Objects.equals(numberOfQuestions, exam.numberOfQuestions) && Objects.equals(categorie, exam.categorie) && Objects.equals(questions, exam.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, title, description, maxPoints, numberOfQuestions, active, categorie, questions);
    }
}
