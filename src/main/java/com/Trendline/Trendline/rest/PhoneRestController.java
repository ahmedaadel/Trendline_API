package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.Phone;
import com.Trendline.Trendline.services.PhoneServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phones")
public class PhoneRestController {
    PhoneServiceImpl entityManager;

     PhoneRestController(PhoneServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Phone addNewClothes(@RequestBody Phone phone){
        return  entityManager.saveItem(phone) ;
    }
    @PutMapping("")
    void updatePhone(@RequestBody Phone phone){
        entityManager.saveItem(phone);

    }

    @GetMapping("")
    List<Phone> getAllPhones()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    Phone getSinglePhone(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deletePhone(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
