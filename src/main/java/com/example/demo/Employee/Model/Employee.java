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
@DiscriminatorColumn(
        name = "TYPE_EMPLOYEE",
        discriminatorType = DiscriminatorType.STRING
)
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    EmployeeType employeeType;
    float salary;
    int bonus;

    @Enumerated(value = EnumType.STRING)
    private EmployeeType typeOfEmployee;

    public Employee(EmployeeType employeeType, float salary, int bonus) {
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }
}
