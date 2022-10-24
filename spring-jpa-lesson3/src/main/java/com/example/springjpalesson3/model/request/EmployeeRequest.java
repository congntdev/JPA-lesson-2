package com.example.springjpalesson3.model.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeeRequest {

    private String name;
    private String position;
    private LocalDateTime checkIN;
    private LocalDateTime checkOut;

}
