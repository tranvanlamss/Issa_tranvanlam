package com.example.tranvanlam.controller;

import com.example.tranvanlam.entity.EmployeeEntity;
import com.example.tranvanlam.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping({"/","/index"})
    public String listAllEmployee(Model model){
        List<EmployeeEntity> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }
    @PostMapping("/create")
    public String createEmployee(Model model, @RequestParam Map<String, String> params){
        String name = params.get("name");
        String wage = params.get("wage");

        EmployeeEntity e = new EmployeeEntity(name, Integer.valueOf(wage));
        service.createEmployee(e);
        return "redirect:/index";
    }
}
