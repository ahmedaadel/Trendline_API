package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.ClothesColorSize;
import com.Trendline.Trendline.entity.Size;
import com.Trendline.Trendline.services.ClothesColorSizeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothesColorSize")
public class ClothesColorSizeRestController {

    ClothesColorSizeServiceImpl entityManager;

    ClothesColorSizeRestController(ClothesColorSizeServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    ClothesColorSize addNewClothesColorSize(@RequestBody ClothesColorSize clothesColorSize){
        return  entityManager.saveItem(clothesColorSize);
    }
    @PutMapping("")
    void updateClothesColorSize(@RequestBody ClothesColorSize clothesColorSize){
        entityManager.saveItem(clothesColorSize);

    }

    @GetMapping("")
    List<ClothesColorSize> getAllClothesColorSize()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    ClothesColorSize getSingleClothesColorSize(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deleteClothesColorSize(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }
}
