package com.example.demo.Employee;

import com.example.demo.Employee.Employee;
import com.example.demo.Employee.Model.EmployeeType;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "DRIVER")
public class Driver extends Employee {

    public Driver(float salary, int bonus) {
        super(EmployeeType.DRIVER, salary, bonus);
    }
}