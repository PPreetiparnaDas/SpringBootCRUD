package com.otz.service;

import java.util.List;

import com.otz.entity.Employee;

public interface EmployeeService {
	public String saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public String deleteEmpById(Integer empId);
	public Employee getEmpById(Integer empId);

}
