package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.WomenAccessory;
import com.Trendline.Trendline.services.WomenAccessoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/womenAccessories")
public class WomenAccessoryRestController {

    WomenAccessoryServiceImpl entityManager;

    WomenAccessoryRestController(WomenAccessoryServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    WomenAccessory addNewWomenAccessory(@RequestBody WomenAccessory womenAccessory){
        return  entityManager.saveItem(womenAccessory);
    }
    @PutMapping("")
    void updateWomenAccessory(@RequestBody WomenAccessory womenAccessory){
        entityManager.saveItem(womenAccessory);

    }

    @GetMapping("")
    List<WomenAccessory> getAllWomenAccessory()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    WomenAccessory getSingleWomenAccessory(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deleteWomenAccessory(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
