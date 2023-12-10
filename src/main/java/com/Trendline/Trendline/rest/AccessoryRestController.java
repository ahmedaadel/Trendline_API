package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Accessory;
import com.Trendline.Trendline.services.AccessoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/accessories")

public class AccessoryRestController {
    AccessoryServiceImpl entityManager;

    @Autowired
    AccessoryRestController(AccessoryServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Accessory addNewAccessory(@RequestBody Accessory accessory){

        return  entityManager.saveItem(accessory);
    }
      @PutMapping("")
    void updateAccessory(@RequestBody Accessory accessory){
          entityManager.saveItem(accessory);

    }

    @GetMapping("")
    List<Accessory> getAllAccessories()
    {

        return entityManager.findAll();
    }
    @GetMapping("/{id}")
    Accessory getSingleAccessories(@PathVariable(name = "id") int id )
    {
        return   entityManager.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteAccessory(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}

