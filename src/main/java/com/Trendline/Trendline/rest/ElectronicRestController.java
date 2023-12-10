package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.ElectronicDevice;
import com.Trendline.Trendline.services.ElectronicDevicesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electronics")
public class ElectronicRestController {
    ElectronicDevicesServiceImpl entityManager;

    @Autowired
    ElectronicRestController(ElectronicDevicesServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    ElectronicDevice addNewClothes(@RequestBody ElectronicDevice electronicDevice){

        return  entityManager.saveItem(electronicDevice);
    }
    @PutMapping("")
    void updateElectronicDevices(@RequestBody ElectronicDevice electronicDevice){
        entityManager.saveItem(electronicDevice);

    }

    @GetMapping("")
    List<ElectronicDevice> getAllElectronicDevices()
    {

        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    ElectronicDevice getSingleClothes(@PathVariable(name = "id") int id )
    {

        return entityManager.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteElectronicDevices(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
