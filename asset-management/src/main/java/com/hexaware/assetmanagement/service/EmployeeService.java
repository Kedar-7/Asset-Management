package com.hexaware.assetmanagement.service;

import com.hexaware.assetmanagement.entities.User;

public interface EmployeeService {
    void registerEmployee(User employee);
    User authenticate(String username, String password);
}
