package com.example.demo.service;

import java.util.List;

import com.example.demo.customeexception.BusinessException;
import com.example.demo.pojo.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee) throws BusinessException;

	public List<Employee> getAllEmployees();

	public Employee getEmpById(Long empidL);

	public void deleteEmpById(Long empidL);

}