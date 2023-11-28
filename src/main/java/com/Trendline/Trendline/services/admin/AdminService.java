package com.Trendline.Trendline.services.admin;

import com.Trendline.Trendline.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin saveAdmin(Admin admin);
    List<Admin> findAllAdmin();
    Admin findAdmin(String id);
    void deleteAdmin(String id);

}
