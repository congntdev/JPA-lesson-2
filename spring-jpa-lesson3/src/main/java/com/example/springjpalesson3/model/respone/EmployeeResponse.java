package com.example.springjpalesson3.model.respone;

import java.time.LocalDateTime;

public interface EmployeeResponse {
    Long getId();
    String getName();
    String getPosition();
    LocalDateTime getCheckIn();
    LocalDateTime getCheckOut();
}
