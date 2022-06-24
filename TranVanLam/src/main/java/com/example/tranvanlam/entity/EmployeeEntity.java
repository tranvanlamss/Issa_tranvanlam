package com.example.tranvanlam.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int wage;

    public EmployeeEntity(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public EmployeeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
