package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.PhoneColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service

public class PhoneColorServiceImpl extends GenericServiceImpl<PhoneColor>  {
    @Autowired
    public PhoneColorServiceImpl(JpaRepository<PhoneColor, Integer> repository) {
        super(repository);
    }
}