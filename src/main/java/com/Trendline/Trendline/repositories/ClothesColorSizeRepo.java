package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.ClothesColorSize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClothesColorSizeRepo extends JpaRepository<ClothesColorSize , Integer> {
    List<ClothesColorSize> findByClothesId(int clothesId);

}
