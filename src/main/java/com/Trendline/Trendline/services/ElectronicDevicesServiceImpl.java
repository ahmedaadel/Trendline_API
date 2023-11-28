package com.Trendline.Trendline.services;


import com.Trendline.Trendline.entity.ElectronicDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ElectronicDevicesServiceImpl extends GenericServiceImpl<ElectronicDevice>  {

    @Autowired
    public ElectronicDevicesServiceImpl(JpaRepository<ElectronicDevice, Integer> repository) {
        super(repository);
    }
}