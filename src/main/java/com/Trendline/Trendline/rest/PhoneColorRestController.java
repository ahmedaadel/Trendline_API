package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.PhoneColor;
import com.Trendline.Trendline.services.PhoneColorServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phoneColor")
public class PhoneColorRestController {

    PhoneColorServiceImpl entityManager;

    PhoneColorRestController(PhoneColorServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    PhoneColor addNewSize(@RequestBody PhoneColor size){
        return  entityManager.saveItem(size);
    }
    @PutMapping("")
    void updatePhoneSize(@RequestBody PhoneColor phoneColor){
        entityManager.saveItem(phoneColor);

    }

    @GetMapping("")
    List<PhoneColor> getAllPhoneSize()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    PhoneColor getSinglePhoneSize(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deletePhoneSize(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }
}
