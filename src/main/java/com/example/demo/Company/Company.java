package com.example.demo.Company;

import com.example.demo.Adrdess.Address;
import com.example.demo.Course.Course;
import com.example.demo.Employee.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    //private String namee;

    @OneToOne(
            fetch=FetchType.LAZY,
            cascade = {CascadeType.ALL}
            //orphanRemoval = true
    )
    private Address address;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "company_id")
    private List<Employee> employeeList = new ArrayList<>();

    public Company(String name, Address address, List<Employee> employeeList){
        this.name = name;
        this.address = address;
        this.employeeList = employeeList;
    }
}
