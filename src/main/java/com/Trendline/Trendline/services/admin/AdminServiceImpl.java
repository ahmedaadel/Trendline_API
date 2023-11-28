package com.Trendline.Trendline.services.admin;
import com.Trendline.Trendline.entity.Admin;

import com.Trendline.Trendline.repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    private AdminRepo adminRepo ;


    @Autowired
    AdminServiceImpl(AdminRepo ar)
    {
        adminRepo= ar ;

    }

    @Override
    public Admin saveAdmin(Admin admin) {
         return adminRepo.save(admin);
    }

    @Override
    public List<Admin> findAllAdmin() {
        return adminRepo.findAll();
    }

    @Override
    public Admin findAdmin(String userName) {
        Optional<Admin> admin = adminRepo.findById(userName) ;
        if (admin.isPresent())
            return admin.get() ;
        else
            return null ;

    }


    @Override
    public void deleteAdmin(String id) {
        adminRepo.deleteById(id);
    }
}
