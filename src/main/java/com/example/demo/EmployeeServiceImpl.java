package com.example.demo;


import com.example.demo.Model.Employee;
import com.example.demo.Model.Programmer;
import com.example.demo.Model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private int number = num;

    @Override
    public double totalSalary(List<Employee> employees) {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    @Override
    public double totalBonus(List<Employee> employeesBonus) {
        return employeesBonus.stream().mapToDouble(Employee::getBonus).sum();
    }

    @Override
    public int writeNumber() {
        number++;
        System.out.println(number);
        return number;
    }

    @Override
    public double getSum(ArrayList<Employee> employees){
        System.out.println(totalBonus(employees) + totalSalary(employees));
        return totalBonus(employees) + totalSalary(employees);
    }
}
