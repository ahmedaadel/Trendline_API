package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class SizeServiceImpl extends GenericServiceImpl<Size>  {

    JpaRepository<Size, Integer> repository ;
    @Autowired
    public SizeServiceImpl(JpaRepository<Size, Integer> repository) {
        super(repository);
        this.repository = repository;
    }


    public List<String> getSizesBySizeIds(List<Integer> sizeIds) {
        return repository.findAllById(sizeIds).stream()
                .map(Size::getSize)
                .collect(Collectors.toList());
    }
}