package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class PhoneServiceImpl extends GenericServiceImpl<Phone> {
    @Autowired
    public PhoneServiceImpl(JpaRepository<Phone, Integer> repository) {
        super(repository);
    }
}