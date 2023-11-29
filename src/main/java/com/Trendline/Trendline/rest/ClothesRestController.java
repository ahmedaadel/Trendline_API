package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Accessory;
import com.Trendline.Trendline.entity.Clothes;
import com.Trendline.Trendline.services.AccessoryServiceImpl;
import com.Trendline.Trendline.services.ClothesServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothes")
public class ClothesRestController {
    ClothesServiceImpl entityManager;

    ClothesRestController(ClothesServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Clothes addNewClothes(@RequestBody Clothes clothes){
        Clothes clothes1 = entityManager.saveItem(clothes);
        return  clothes1 ;
    }
    @PutMapping("")
    void updateClothes(@RequestBody Clothes clothes){
        entityManager.saveItem(clothes);

    }

    @GetMapping("")
    List<Clothes> getAllAccessories()
    {
        List<Clothes> clothesList =  entityManager.findAll();
        return clothesList ;
    }
    @GetMapping("/{id}")
    Clothes getSingleClothes(@PathVariable(name = "id") int id )
    {
        Clothes clothesList =  entityManager.findById(id);
        return clothesList ;
    }

    @DeleteMapping("/{id}")
    void deleteClothes(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
