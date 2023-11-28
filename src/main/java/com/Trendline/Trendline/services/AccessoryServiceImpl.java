package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.Accessory;
import com.Trendline.Trendline.repositories.AccessoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccessoryServiceImpl extends GenericServiceImpl<Accessory>  {

    @Autowired
    public AccessoryServiceImpl(AccessoryRepo accessoryRepo) {
        super(accessoryRepo);
    }

    // Additional methods specific to AccessoryServiceImpl, if any
}
