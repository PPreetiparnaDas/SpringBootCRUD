package com.otz.reposatory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otz.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Optional<Employee> findByEmpId(Integer empId);
	
}
