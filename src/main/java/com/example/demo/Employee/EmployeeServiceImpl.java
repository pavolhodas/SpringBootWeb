package com.example.demo.Employee;


import com.example.demo.Employee.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

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

    @Override
    public Employee saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
