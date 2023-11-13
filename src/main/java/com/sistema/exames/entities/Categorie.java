package com.sistema.exames.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categorieId;

    private String title;
    private String description;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Exam> exams = new LinkedHashSet<>();

    public Categorie() {}

    public Categorie(Long categorieId, String title, String description, Set<Exam> exams) {
        this.categorieId = categorieId;
        this.title = title;
        this.description = description;
        this.exams = exams;
    }

    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
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

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(categorieId, categorie.categorieId) && Objects.equals(title, categorie.title) && Objects.equals(description, categorie.description) && Objects.equals(exams, categorie.exams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categorieId, title, description, exams);
    }
}
