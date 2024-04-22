package com.torryharris.springbootjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.springbootjpa.entity.Employee;
import com.torryharris.springbootjpa.exception.EmployeeNotFoundException;
import com.torryharris.springbootjpa.exception.InvalidEmployeeDataException;
import com.torryharris.springbootjpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		if(employee.getExperienceInYears()<0 
				|| employee.getSalary()<0
				||employee.getDesignation().equals(""))
			throw new InvalidEmployeeDataException("Employee data is Incorrect");
		employeeRepository.save(employee);	
	}
	
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		Optional<Employee> empOpt=employeeRepository.findById(employeeId);	
		if(empOpt.isPresent()) 
			return empOpt.get();
		else
			throw new EmployeeNotFoundException
			("Employee Not Found with ID:"+employeeId);
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {	
		Optional<Employee> empOpt=employeeRepository.findById(employeeId);
		if(empOpt.isEmpty())
			throw new EmployeeNotFoundException
			("Employee Not Found with ID:"+employeeId);
		Employee employee=empOpt.get();
		employeeRepository.delete(employee);
	}

	@Override
	public Employee getByEmployeeName(String employeeName) {
		Optional<Employee> empOpt=
				employeeRepository.findByEmployeeName(employeeName);
		if(empOpt.isPresent()) 
			return empOpt.get();
		else
			throw new EmployeeNotFoundException
			("Employee Not Found with Name:"+employeeName);
	}
	
	@Override
	public void updateEmployee(Integer employeeId, Employee updatedEmployee) {
		Employee emp = getEmployeeById(employeeId);
		emp.setEmployeeName(updatedEmployee.getEmployeeName());
		emp.setDesignation(updatedEmployee.getDesignation());
		emp.setExperienceInYears(updatedEmployee.getExperienceInYears());
		emp.setSalary(updatedEmployee.getSalary());		
		employeeRepository.save(emp);
		
	}

}
