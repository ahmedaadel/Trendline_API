package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class SizeServiceImpl extends GenericServiceImpl<Size>  {

    @Autowired
    public SizeServiceImpl(JpaRepository<Size, Integer> repository) {
        super(repository);
    }
}