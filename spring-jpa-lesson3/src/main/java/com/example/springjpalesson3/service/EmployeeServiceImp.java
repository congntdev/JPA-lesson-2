package com.example.springjpalesson3.service;

import com.example.springjpalesson3.model.entity.Employee;
import com.example.springjpalesson3.model.request.EmployeeRequest;
import com.example.springjpalesson3.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EmployeeServiceImp implements IEmployeeService {

    @Autowired
    public EmployeeRepository repository;

    @Override
    public Employee create(EmployeeRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setPosition(request.getPosition());
        employee.setCheckIN(request.getCheckIN());
        employee.setCheckOut(request.getCheckOut());
        repository.save(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Employee> getEmployeeByHours() {
        List<Employee> employeeByHours = repository.findAll().stream().filter(employee -> employee.getCheckIN().isAfter(LocalDateTime.of(2022, 10, 24, 7, 0)))
                .filter(employee -> employee.getCheckIN().isBefore(LocalDateTime.of(2022, 10, 24, 8, 0)))
                .toList();
        return employeeByHours;
    }
}
