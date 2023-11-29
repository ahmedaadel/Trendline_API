package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.ClothesColorSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class ClothesColorSizeServiceImpl extends GenericServiceImpl<ClothesColorSize>  {
    @Autowired
    public ClothesColorSizeServiceImpl(JpaRepository<ClothesColorSize, Integer> repository) {
        super(repository);
    }

}