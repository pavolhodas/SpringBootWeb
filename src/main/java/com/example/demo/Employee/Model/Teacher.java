package com.example.demo.Employee.Model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@NoArgsConstructor
@Entity
public class Teacher extends Employee {
    public Teacher(float salary, int bonus) {
        super(EmployeeType.TEACHER, salary, bonus);
    }
}
