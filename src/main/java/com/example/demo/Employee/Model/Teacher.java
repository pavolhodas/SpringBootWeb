package com.example.demo.Employee.Model;

public class Teacher extends Employee {

    public Teacher(float salary, int bonus) {
        super(EmployeeType.TEACHER, salary, bonus);
    }
}
