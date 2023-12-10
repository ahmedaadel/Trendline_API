package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.PhoneColorIDs;
import com.Trendline.Trendline.services.PhoneColorIDsServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phoneColor")
public class PhoneColorIDsRestController {

    PhoneColorIDsServiceImpl entityManager;

    PhoneColorIDsRestController(PhoneColorIDsServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    PhoneColorIDs addNewSize(@RequestBody PhoneColorIDs size){
        return  entityManager.saveItem(size);
    }
    @PutMapping("")
    void updatePhoneSize(@RequestBody PhoneColorIDs phoneColorIDs){
        entityManager.saveItem(phoneColorIDs);

    }

    @GetMapping("")
    List<PhoneColorIDs> getAllPhoneSize()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    PhoneColorIDs getSinglePhoneSize(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deletePhoneSize(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

    @GetMapping("/colors/{phoneId}")
    List<String> getColorCodesByColorIds(@PathVariable(name = "phoneId") int phoneId) {
        return entityManager.getColorCodesByPhoneId(phoneId);
    }
}
