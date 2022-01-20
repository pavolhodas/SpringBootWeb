package com.example.demo.Employee;

import com.example.demo.Employee.Employee;
import com.example.demo.Employee.Model.EmployeeType;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "PROGRAMMER")
public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(EmployeeType.PROGRAMMER, salary, bonus);
    }
    private final float programmerSalary = salary + bonus;

    public void getInfo() {
        System.out.println(employeeType + "'s salary is " + programmerSalary);
    }
}
