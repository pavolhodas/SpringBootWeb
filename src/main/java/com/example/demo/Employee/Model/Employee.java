package com.example.demo.Employee.Model;

public abstract class Employee {
    EmployeeType employeeType;
    float salary;
    int bonus;

    public Employee(EmployeeType employeeType, float salary, int bonus) {
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void getInfo(){
        System.out.println(employeeType + "'s salary is " + salary + " and bonus is " + bonus);
    }

    public float getSalary() {
        return salary;
    }

    public float getBonus(){
        return bonus;
    }
}
