package com.sistema.exames.services.implementation;

import com.sistema.exames.entities.Categorie;
import com.sistema.exames.repositories.CategorieRepository;
import com.sistema.exames.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Set<Categorie> getAllCategories() {
        return new LinkedHashSet<>(categorieRepository.findAll());
    }

    @Override
    public Categorie getCategorie(Long categorieId) {
        return categorieRepository.findById(categorieId).get();
    }

    @Override
    public void deleteCategorie(Long categorieId) {
        Categorie categorie = new Categorie();
        categorie.setCategorieId(categorieId);

        categorieRepository.delete(categorie);
    }
}
