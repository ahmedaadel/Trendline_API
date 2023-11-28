package com.Trendline.Trendline.repositories;

import com.Trendline.Trendline.entity.ElectronicDevice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicDevicesRepo extends JpaRepository<ElectronicDevice, Integer> {
}
