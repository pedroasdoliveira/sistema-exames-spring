package com.sistema.exames.services;

import com.sistema.exames.entities.Categorie;

import java.util.Set;

public interface CategorieService {

    Categorie createCategorie(Categorie categorie);

    Categorie updateCategorie(Categorie categorie);

    Set<Categorie> getAllCategories();

    Categorie getCategorie(Long categorieId);

    void deleteCategorie(Long categorieId);
}
