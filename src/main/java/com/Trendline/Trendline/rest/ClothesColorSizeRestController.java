package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.ClothesColorSize;
import com.Trendline.Trendline.services.ClothesColorSizeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clothesColorSize")
public class ClothesColorSizeRestController {

    ClothesColorSizeServiceImpl entityManager;

    @Autowired
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
    @GetMapping("/colors/{clothesId}")
    List<String> getAllClothesColors(@PathVariable(name = "clothesId" ) int clothesId)
    {
        return  entityManager.getColorCodesByClothesId(clothesId);
    }
    @GetMapping("/sizes/{clothesId}")
    List<String> getAllClothesSizes(@PathVariable(name = "clothesId" ) int clothesId)
    {
        return  entityManager.getSizesByClothesId(clothesId);
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
