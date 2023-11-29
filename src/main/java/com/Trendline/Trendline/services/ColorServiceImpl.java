package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class ColorServiceImpl extends GenericServiceImpl<Color>  {

    @Autowired
    public ColorServiceImpl(JpaRepository<Color, Integer> repository) {
        super(repository);
    }
}