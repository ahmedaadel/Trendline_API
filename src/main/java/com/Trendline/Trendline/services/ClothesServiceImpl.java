package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.BeautyProduct;
import com.Trendline.Trendline.entity.Clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class ClothesServiceImpl extends GenericServiceImpl<Clothes>  {

    @Autowired
    public ClothesServiceImpl(JpaRepository<Clothes, Integer> repository) {
        super(repository);
    }
}