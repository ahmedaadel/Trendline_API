package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Admin;
import com.Trendline.Trendline.services.admin.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminRestController {
    AdminServiceImpl entityManager;
    @Autowired

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
        return entityManager.findAllAdmin();
    }
    @GetMapping("/{id}")
    Admin getSingleAccessories(@PathVariable(name = "id") String id )
    {
        return  entityManager.findAdmin(id);
    }

    @DeleteMapping("/{id}")
    void deleteAdmin(@PathVariable(name = "id" )String id){
        entityManager.deleteAdmin(id);
    }

}

