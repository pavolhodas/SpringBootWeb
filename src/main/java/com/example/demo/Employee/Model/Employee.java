package com.example.demo.Employee.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    EmployeeType employeeType;
    float salary;
    int bonus;

    public Employee(EmployeeType employeeType, float salary, int bonus) {
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }
}
