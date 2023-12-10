package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.PhoneColorIDs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneColorIDsRepo extends JpaRepository<PhoneColorIDs, Integer> {

    List<PhoneColorIDs> findByPhoneId(int phoneId);

}
