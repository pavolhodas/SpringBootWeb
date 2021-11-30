package com.example.demo.Model;

public class Programmer extends Employee{

    private final float programmerSalary = salary + bonus;

    public Programmer(float salary, int bonus) {
        super(EmployeeType.PROGRAMMER, salary, bonus);
    }

    public void getInfo() {
        System.out.println(employeeType + "'s salary is " + programmerSalary);
    }
}
