package com.torryharris.springbootjpa.service;

import java.util.List;

import com.torryharris.springbootjpa.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer employeeId);
	void addEmployee(Employee employee);
	void deleteEmployeeById(Integer employeeId);
	void updateEmployee(Integer employeeId, Employee updatedEmployee);
	Employee getByEmployeeName(String employeeName);

}
