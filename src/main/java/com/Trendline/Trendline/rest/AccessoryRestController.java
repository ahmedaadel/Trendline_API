package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Accessory;
import com.Trendline.Trendline.services.AccessoryServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping("/accessories")

public class AccessoryRestController {
    AccessoryServiceImpl entityManager;

    AccessoryRestController(AccessoryServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Accessory addNewAccessory(@RequestBody Accessory accessory){
        Accessory accessory1 = entityManager.saveItem(accessory);
        return  accessory1 ;
    }
      @PutMapping("")
    void updateAccessory(@RequestBody Accessory accessory){
          entityManager.saveItem(accessory);

    }

    @GetMapping("")
    List<Accessory> getAllAccessories()
    {
        List<Accessory> accessoryList =  entityManager.findAll();
        return accessoryList ;
    }
    @GetMapping("/{id}")
    Accessory getSingleAccessories(@PathVariable(name = "id") int id )
    {
        Accessory accessoryList =  entityManager.findById(id);
        return accessoryList ;
    }

    @DeleteMapping("/{id}")
    void deleteAccessory(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}

