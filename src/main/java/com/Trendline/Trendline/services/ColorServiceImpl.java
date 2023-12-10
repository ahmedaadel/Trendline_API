package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.stream.Collectors;


public class ColorServiceImpl extends GenericServiceImpl<Color>  {

      JpaRepository<Color, Integer> repository ;

    @Autowired
    public ColorServiceImpl(JpaRepository<Color, Integer> repository) {
        super(repository);
        this.repository=repository;
    }


    public  List<String> getColorCodesByColorIds(List<Integer> colorIds) {
        return repository.findAllById(colorIds).stream()
                .map(Color::getColorCode)
                .collect(Collectors.toList());
    }
}