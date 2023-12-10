package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Clothes;
import com.Trendline.Trendline.services.ClothesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothes")
public class ClothesRestController {
    ClothesServiceImpl entityManager;

    @Autowired
    ClothesRestController(ClothesServiceImpl manager) {
        entityManager = manager;
    }

    @PostMapping("")
    Clothes addNewClothes(@RequestBody Clothes clothes) {

        return entityManager.saveItem(clothes);
    }

    @PutMapping("")
    void updateClothes(@RequestBody Clothes clothes) {
        entityManager.saveItem(clothes);

    }

    @GetMapping("")
    List<Clothes> getAllAccessories() {
        return entityManager.findAll();
    }

    @GetMapping("/{id}")
    Clothes getSingleClothes(@PathVariable(name = "id") int id) {
        return  entityManager.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteClothes(@PathVariable(name = "id") int id) {
        entityManager.deleteItem(id);
    }

}
