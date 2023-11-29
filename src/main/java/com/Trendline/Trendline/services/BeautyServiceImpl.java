package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.BeautyProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class BeautyServiceImpl extends GenericServiceImpl<BeautyProduct>  {

    @Autowired
    public BeautyServiceImpl(JpaRepository<BeautyProduct, Integer> repository) {
        super(repository);
    }
}