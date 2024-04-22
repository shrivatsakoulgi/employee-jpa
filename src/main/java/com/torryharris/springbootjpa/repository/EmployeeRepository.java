package com.torryharris.springbootjpa.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.torryharris.springbootjpa.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Optional<Employee> findByEmployeeName(String employeeName);
}
