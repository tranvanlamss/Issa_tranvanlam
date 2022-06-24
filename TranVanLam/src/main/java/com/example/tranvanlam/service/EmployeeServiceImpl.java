package com.example.tranvanlam.service;

import com.example.tranvanlam.entity.EmployeeEntity;
import com.example.tranvanlam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository repository;
    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return repository.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return repository.save(employee);
    }
}
