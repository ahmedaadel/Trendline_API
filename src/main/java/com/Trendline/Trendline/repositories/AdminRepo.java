package com.Trendline.Trendline.repositories;


import com.Trendline.Trendline.entity.Admin;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin,String> {

}
