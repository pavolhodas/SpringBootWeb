package com.example.demo.Employee.Model;

import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "TEACHER")
public class Teacher extends Employee {
    public Teacher(float salary, int bonus) {
        super(EmployeeType.TEACHER, salary, bonus);
    }
}
