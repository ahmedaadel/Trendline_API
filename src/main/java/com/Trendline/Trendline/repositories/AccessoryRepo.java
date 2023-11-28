package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.Accessory;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AccessoryRepo extends JpaRepository<Accessory,Integer> {

}

