package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Phone;
import com.Trendline.Trendline.entity.Size;
import com.Trendline.Trendline.services.SizeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sizes")
public class SizeRestController {


    SizeServiceImpl entityManager;

    SizeRestController(SizeServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Size addNewSize(@RequestBody Size size){
        return  entityManager.saveItem(size);
    }
    @PutMapping("")
    void updateSize(@RequestBody Size size){
        entityManager.saveItem(size);

    }

    @GetMapping("")
    List<Size> getAllSize()
    {
        return  entityManager.findAll();
    }
    @GetMapping("/{id}")
    Size getSingleSize(@PathVariable(name = "id") int id )
    {
        return  entityManager.findById(id) ;
    }

    @DeleteMapping("/{id}")
    void deleteSize(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
