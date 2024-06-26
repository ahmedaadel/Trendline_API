package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.WomenAccessory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class WomenAccessoryServiceImpl extends GenericServiceImpl<WomenAccessory>  {
    @Autowired
    public WomenAccessoryServiceImpl(JpaRepository<WomenAccessory, Integer> repository) {
        super(repository);
    }
}