package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.BeautyProduct;
import com.Trendline.Trendline.services.BeautyServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/beauty")
public class BeautyRestController {
    BeautyServiceImpl entityManager;

    BeautyRestController(BeautyServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    BeautyProduct addNewBeautyProduct(@RequestBody  BeautyProduct beautyProduct){
        BeautyProduct beautyProduct1 = entityManager.saveItem(beautyProduct);
        return  beautyProduct1 ;
    }

    @PutMapping("")
    void updateBeautyProduct(@RequestBody BeautyProduct beautyProduct){
        entityManager.saveItem(beautyProduct);

    }

    @GetMapping("")
    List<BeautyProduct> getAllAcBeauty()
    {
        List<BeautyProduct> BeautyList =  entityManager.findAll();
        return BeautyList ;
    }
    @GetMapping("/{id}")
    BeautyProduct getSingleAcBeauty(@PathVariable(name = "id") int id )
    {
        BeautyProduct BeautyList =  entityManager.findById(id);
        return BeautyList ;
    }

    @DeleteMapping("/{id}")
    void deleteBeautyProduct(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
