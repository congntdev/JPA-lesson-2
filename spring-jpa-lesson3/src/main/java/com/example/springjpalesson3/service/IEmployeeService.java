package com.example.springjpalesson3.service;

import com.example.springjpalesson3.model.entity.Employee;
import com.example.springjpalesson3.model.request.EmployeeRequest;

import java.util.List;

public interface IEmployeeService {

    Employee create(EmployeeRequest request);

    List<Employee> getAll();

    Employee getEmployeeById(Long id);

    List<Employee> getEmployeeByHours();
}
