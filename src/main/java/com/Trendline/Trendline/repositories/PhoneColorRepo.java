package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.PhoneColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhoneColorRepo extends JpaRepository<PhoneColor, Integer> {


}
