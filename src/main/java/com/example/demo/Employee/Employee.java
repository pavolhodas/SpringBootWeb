package com.example.demo.Employee;

import com.example.demo.Employee.Model.EmployeeType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "employeeType",
        defaultImpl = EmployeeType.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Driver.class, name = "Driver"),
        @JsonSubTypes.Type(value = Programmer.class, name = "Programmer"),
        @JsonSubTypes.Type(value = Teacher.class, name = "Teacher")
})
public abstract class Employee {
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
