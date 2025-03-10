package com.otz.controller;

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

import com.otz.entity.Employee;
import com.otz.service.EmployeeService;

@RestController//Handles HTTP Requests ,Simplifies JSON Responses
@RequestMapping("/emp-api")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@PostMapping("/Save")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee){
		String msg=service.saveEmployee(employee);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/getAllEmp")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> listEmp=service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(listEmp,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId){
		String msg=	service.deleteEmpById(empId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/edit/{empId}")
	public ResponseEntity<Employee> getEmpById(@PathVariable Integer empId){
		Employee employee=service.getEmpById(empId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmp(@RequestBody Employee employee){
		String msg=service.saveEmployee(employee);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
