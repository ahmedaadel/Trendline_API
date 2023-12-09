package com.Trendline.Trendline.rest;


import com.Trendline.Trendline.entity.ElectronicDevice;
import com.Trendline.Trendline.services.ElectronicDevicesServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/electronics")
public class ElectronicRestController {
    ElectronicDevicesServiceImpl entityManager;

    ElectronicRestController(ElectronicDevicesServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    ElectronicDevice addNewClothes(@RequestBody ElectronicDevice electronicDevice){
        ElectronicDevice electronicDevice1 = entityManager.saveItem(electronicDevice);
        return  electronicDevice1 ;
    }
    @PutMapping("")
    void updateElectronicDevices(@RequestBody ElectronicDevice electronicDevice){
        entityManager.saveItem(electronicDevice);

    }

    @GetMapping("")
    List<ElectronicDevice> getAllElectronicDevices()
    {
        List<ElectronicDevice> electronicDeviceList =  entityManager.findAll();
        return electronicDeviceList ;
    }
    @GetMapping("/{id}")
    ElectronicDevice getSingleClothes(@PathVariable(name = "id") int id )
    {
        ElectronicDevice electronicDevice =  entityManager.findById(id);
        return electronicDevice ;
    }

    @DeleteMapping("/{id}")
    void deleteElectronicDevices(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
