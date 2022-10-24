package com.example.springjpalesson3.repository;

import com.example.springjpalesson3.model.entity.Employee;
import com.example.springjpalesson3.model.request.EmployeeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
