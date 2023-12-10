package com.Trendline.Trendline.services;

import com.Trendline.Trendline.entity.ClothesColorSize;
import com.Trendline.Trendline.repositories.ClothesColorSizeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ClothesColorSizeServiceImpl extends GenericServiceImpl<ClothesColorSize>  {
    ClothesColorSizeRepo repository;
    @Autowired
    ColorServiceImpl colorService ;
    @Autowired
    SizeServiceImpl sizeService ;

    @Autowired
    public ClothesColorSizeServiceImpl(ClothesColorSizeRepo repository) {
        super(repository);
        this.repository= repository;
    }


    public List<Integer> getColorIdsByClothesId(int clothesId) {
        return this.repository.findByClothesId(clothesId).stream()
                .map(ClothesColorSize::getColorId)
                .collect(Collectors.toList());
    }

    public List<String> getColorCodesByClothesId(int clothesId) {
        List<Integer> colorIds = getColorIdsByClothesId(clothesId);
        return colorService.getColorCodesByColorIds(colorIds);
    }
    public List<Integer> getSizeIdsByClothesId(int clothesId) {
        return this.repository.findByClothesId(clothesId).stream()
                .map(ClothesColorSize::getSizeId)
                .collect(Collectors.toList());
    }

    public List<String> getSizesByClothesId(int clothesId) {
        List<Integer> sizeIds = getSizeIdsByClothesId(clothesId);
        return sizeService.getSizesBySizeIds(sizeIds);
    }

}