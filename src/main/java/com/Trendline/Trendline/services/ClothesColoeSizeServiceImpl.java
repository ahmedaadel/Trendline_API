package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.ClothesColorSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public class ClothesColoeSizeServiceImpl extends GenericServiceImpl<ClothesColorSize>  {
    @Autowired
    public ClothesColoeSizeServiceImpl(JpaRepository<ClothesColorSize, Integer> repository) {
        super(repository);
    }

}