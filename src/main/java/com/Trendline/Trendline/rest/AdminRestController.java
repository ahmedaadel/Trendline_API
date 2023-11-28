package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Accessory;
import com.Trendline.Trendline.entity.Admin;
import com.Trendline.Trendline.services.admin.AdminServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admins")

public class AdminRestController {
    AdminServiceImpl entityManager;

    AdminRestController(AdminServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Admin addNewAdmin(@RequestBody Admin accessory){
         return entityManager.saveAdmin(accessory);

    }
    @PutMapping("")
    Admin updateAdmin(@RequestBody Admin accessory){
        return entityManager.saveAdmin(accessory);
    }

    @GetMapping("")
    List<Admin> getAllAccessories()
    {
        List<Admin> accessoryList =  entityManager.findAllAdmin();
        return accessoryList ;
    }
    @GetMapping("/{id}")
    Admin getSingleAccessories(@PathVariable(name = "id") String id )
    {
        Admin accessoryList =  entityManager.findAdmin(id);
        return accessoryList ;
    }

    @DeleteMapping("/{id}")
    void deleteAdmin(@PathVariable(name = "id" )String id){
        entityManager.deleteAdmin(id);
    }

}

