package com.locMns.controller;

import com.locMns.dao.IngredientDao;
import com.locMns.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/ingredient")
public class IngredientController {

    @Autowired
    protected IngredientDao ingredientDao;

    @GetMapping("/liste")
    public List<Ingredient> obtenirTousLesIngredients() {
        return ingredientDao.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> obtenirIngredientparId(@PathVariable int id) {
        Optional<Ingredient> optionalIngredient = ingredientDao.findById(id);
        if(optionalIngredient.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(optionalIngredient.get(),HttpStatus.OK);
    }

    @PostMapping("")
    public Ingredient creerIngredient(@RequestBody Ingredient ingredientToInsert) {
        System.out.println("Libelle reçu : " + ingredientToInsert.getLibelle());
        ingredientToInsert.setId(null);
        ingredientDao.save(ingredientToInsert);
        return ingredientToInsert;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerIngredient(@PathVariable int id) {
        Optional<Ingredient> optionalIngredient = ingredientDao.findById(id);
        if (optionalIngredient.isEmpty()) {
            return new ResponseEntity<>((HttpStatus.NOT_FOUND));
        }
        ingredientDao.deleteById(id);

        return new ResponseEntity<>((HttpStatus.NO_CONTENT));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> modifierIngredient(@PathVariable int id,
                                              @RequestBody Ingredient ingredientToUpdate) {

        ingredientToUpdate.setId(id);

        Optional<Ingredient> optionalIngredient = ingredientDao.findById(id);
        if (optionalIngredient.isEmpty()) {
            return new ResponseEntity<>((HttpStatus.NOT_FOUND));
        }

        ingredientDao.save(ingredientToUpdate);

        return new ResponseEntity<>((HttpStatus.NO_CONTENT));
    }
}
