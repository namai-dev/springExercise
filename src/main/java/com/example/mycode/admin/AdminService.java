package com.example.mycode.admin;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    public final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAdmin(){
        return adminRepository.findAll();
    }
}
