package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Employee;

public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {

}