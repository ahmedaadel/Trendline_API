package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.PhoneColor;
import com.Trendline.Trendline.repositories.PhoneColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PhoneColorServiceImpl extends GenericServiceImpl<PhoneColor>  {

    @Autowired
    public PhoneColorServiceImpl(PhoneColorRepo repository) {
        super(repository);
    }



}