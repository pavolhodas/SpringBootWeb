package com.example.demo.Employee.Model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@NoArgsConstructor
@Entity
public class Driver extends Employee {

    public Driver(float salary, int bonus) {
        super(EmployeeType.DRIVER, salary, bonus);
    }
}
