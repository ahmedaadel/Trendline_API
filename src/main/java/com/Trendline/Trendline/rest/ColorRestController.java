package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Color;
import com.Trendline.Trendline.services.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/colors")
public class ColorRestController {

    ColorServiceImpl entityManager;
    @Autowired
    ColorRestController(ColorServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Color addNewColor(@RequestBody Color color){
        return  entityManager.saveItem(color);
    }
    @PutMapping("")
    void updateColor(@RequestBody Color color){
        entityManager.saveItem(color);

    }

    @GetMapping("")
    List<Color> getAllColor()
    {
        return entityManager.findAll();
    }
    @GetMapping("/{id}")
    Color getSingleColor(@PathVariable(name = "id") int id )
    {
        return entityManager.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteColor(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

    @GetMapping("/codes")
    List<String> getColorCodesByColorIds(@RequestParam List<Integer> colorIds) {
        return entityManager.getColorCodesByColorIds(colorIds);
    }

}
