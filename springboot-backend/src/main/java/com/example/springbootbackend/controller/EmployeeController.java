package com.example.springbootbackend.controller;

import com.example.springbootbackend.entity.Employee;
import com.example.springbootbackend.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepository;

  @GetMapping("/employees")
  public List<Employee> fetchEmployees() {
    return employeeRepository.findAll();
  }

}
