package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.PhoneSize;
import com.Trendline.Trendline.services.PhoneSizeServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phoneSizes")
public class PhoneSizeRestController {

    PhoneSizeServiceImpl entityManager;

    PhoneSizeRestController(PhoneSizeServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    PhoneSize addNewSize(@RequestBody PhoneSize size){
        return  entityManager.saveItem(size);
    }
    @PutMapping("")
    void updatePhoneSize(@RequestBody PhoneSize phoneSize){
        entityManager.saveItem(phoneSize);

    }

    @GetMapping("")
    List<PhoneSize> getAllPhoneSize()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    PhoneSize getSinglePhoneSize(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deletePhoneSize(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }
}
