package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.BeautyProduct;
import com.Trendline.Trendline.services.BeautyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@RequestMapping("/beauty")
public class BeautyRestController {
    BeautyServiceImpl entityManager;
    @Autowired
    BeautyRestController(BeautyServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    BeautyProduct addNewBeautyProduct(@RequestBody  BeautyProduct beautyProduct){
        return  entityManager.saveItem(beautyProduct);
    }

    @PutMapping("")
    void updateBeautyProduct(@RequestBody BeautyProduct beautyProduct){
        entityManager.saveItem(beautyProduct);

    }

    @GetMapping("")
    List<BeautyProduct> getAllAcBeauty()
    {

        return entityManager.findAll();
    }
    @GetMapping("/{id}")
    BeautyProduct getSingleAcBeauty(@PathVariable(name = "id") int id )
    {
        return entityManager.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteBeautyProduct(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
