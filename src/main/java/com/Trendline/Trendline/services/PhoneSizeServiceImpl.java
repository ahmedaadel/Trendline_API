package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.ClothesColorSize;
import com.Trendline.Trendline.entity.PhoneSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class PhoneSizeServiceImpl extends GenericServiceImpl<PhoneSize>  {
    @Autowired
    public PhoneSizeServiceImpl(JpaRepository<PhoneSize, Integer> repository) {
        super(repository);
    }
}