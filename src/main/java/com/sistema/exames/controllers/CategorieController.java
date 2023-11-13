package com.sistema.exames.controllers;

import com.sistema.exames.entities.Categorie;
import com.sistema.exames.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("/")
    public ResponseEntity<Categorie> addCategorie(@RequestBody Categorie categorie) {
        Categorie categorieCreated = categorieService.createCategorie(categorie);

        return ResponseEntity.ok(categorieCreated);
    }

    @GetMapping("/{categorieId}")
    public Categorie getCategorieById(@PathVariable("categorieId") Long categorieId) {
        return categorieService.getCategorie(categorieId);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllCategories() {
        return ResponseEntity.ok(categorieService.getAllCategories());
    }

    @PutMapping("/")
    public Categorie updateCategorie(@RequestBody Categorie categorie) {
        return categorieService.updateCategorie(categorie);
    }

    @DeleteMapping("/{categorieId}")
    public void deleteCategorie(@PathVariable("categorieId") Long categorieId) {
        categorieService.deleteCategorie(categorieId);
    }
}
