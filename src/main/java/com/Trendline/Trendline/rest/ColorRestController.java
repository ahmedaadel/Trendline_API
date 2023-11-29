package com.Trendline.Trendline.rest;

import com.Trendline.Trendline.entity.Clothes;
import com.Trendline.Trendline.entity.Color;
import com.Trendline.Trendline.services.ColorServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/colors")
public class ColorRestController {

    ColorServiceImpl entityManager;

    ColorRestController(ColorServiceImpl manager)
    {
        entityManager = manager;
    }

    @PostMapping("")
    Color addNewColor(@RequestBody Color color){
        Color color1 = entityManager.saveItem(color);
        return  color1 ;
    }
    @PutMapping("")
    void updateColor(@RequestBody Color color){
        entityManager.saveItem(color);

    }

    @GetMapping("")
    List<Color> getAllColor()
    {
        List<Color> ColorList =  entityManager.findAll();
        return ColorList ;
    }
    @GetMapping("/{id}")
    Color getSingleColor(@PathVariable(name = "id") int id )
    {
        Color colorList =  entityManager.findById(id);
        return colorList ;
    }

    @DeleteMapping("/{id}")
    void deleteColor(@PathVariable(name = "id" )int id){
        entityManager.deleteItem(id);
    }

}
