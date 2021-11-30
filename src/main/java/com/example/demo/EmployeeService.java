package com.example.demo;

import com.example.demo.Model.Employee;

import java.util.ArrayList;
import java.util.List;


public interface EmployeeService {

    public int num = 0;

    public int writeNumber();

    public double getSum(ArrayList<Employee> employees);

    public double totalSalary(List<Employee> employeesSalary);

    public double totalBonus(List<Employee> employeesBonus);
}
