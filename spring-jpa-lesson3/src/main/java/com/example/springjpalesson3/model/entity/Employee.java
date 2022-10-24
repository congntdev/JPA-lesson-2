package com.example.springjpalesson3.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "employee")
@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String name;

    @Column
    private String position;

    @Column(name = "check_in")
    private LocalDateTime checkIN;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
