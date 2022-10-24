package com.example.springjpalesson3.controller;

import com.example.springjpalesson3.model.entity.Employee;
import com.example.springjpalesson3.model.request.EmployeeRequest;
import com.example.springjpalesson3.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @PostMapping
    ResponseEntity<Employee> create(@RequestBody EmployeeRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @GetMapping("/time")
    ResponseEntity<List<Employee>> getEmployeeByTime() {
        return ResponseEntity.ok(service.getEmployeeByHours());
    }
}
