package com.example.tranvanlam.service;

import com.example.tranvanlam.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    EmployeeEntity createEmployee(EmployeeEntity employee);
}
