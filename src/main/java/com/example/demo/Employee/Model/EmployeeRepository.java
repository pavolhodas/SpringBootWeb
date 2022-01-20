package com.example.demo.Employee.Model;

import com.example.demo.Employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
