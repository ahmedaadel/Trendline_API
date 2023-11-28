package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepo extends JpaRepository<Clothes,Integer> {
}
