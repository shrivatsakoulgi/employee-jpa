package com.torryharris.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.springbootjpa.entity.Employee;
import com.torryharris.springbootjpa.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeJpaController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	@GetMapping("/name/{employeeName}")
	public Employee getEmployeeByName(@PathVariable String employeeName) {
		return employeeService.getByEmployeeName(employeeName);
	}
	
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return new ResponseEntity<>("Employee Successfully added with ID: "+employee.getEmployeeId(),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return new ResponseEntity<>("Employee Successfully Deleted with ID: "+employeeId,HttpStatus.OK);
	}

	@PutMapping("/{employeeId}")
	public ResponseEntity<String> updateEmployee(@PathVariable Integer employeeId, @RequestBody Employee updatedEmployee){
		employeeService.updateEmployee(employeeId, updatedEmployee);
		return new ResponseEntity<>("Employee Successfully Updated with ID: "+employeeId,HttpStatus.OK);
	}
	
	
	
	
	
	
}
