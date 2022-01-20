package com.example.demo.Employee.Model;

import com.example.demo.Employee.Employee;

import java.util.ArrayList;
import java.util.List;


public interface EmployeeService {

    int num = 0;

    int writeNumber();

    double getSum(ArrayList<Employee> employees);

    double totalSalary(List<Employee> employeesSalary);

    double totalBonus(List<Employee> employeesBonus);

    Employee saveEmployee(Employee employee);
}
