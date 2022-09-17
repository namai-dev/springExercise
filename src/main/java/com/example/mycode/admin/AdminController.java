package com.example.mycode.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "amo/api/admin")
public class AdminController {
    public final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping(path = "showAdmin")
    public List<Admin> getAdmin(){
        return adminService.getAdmin();
    }
}
