package com.otz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otz.entity.Employee;
import com.otz.reposatory.EmployeeRepo;
@Service
public class EmployeeServiceIMPL implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;//here all methods are present.
	@Override
	public String saveEmployee(Employee employee) {
		int empId=repo.save(employee).getEmpId();
		if(empId>0){
			return "Successful";
		}else {
			return "Failed";
		}
	}
	@Override
	public List<Employee> getAllEmployee() {

		return repo.findAll() ;
	}
	@Override
	public String deleteEmpById(Integer empId) {
		Optional<Employee>	opt=repo.findById(empId);
		if(opt.isPresent()){
			repo.deleteById(empId);
			return "Success";
		}else {
			return "Failed";
		}
	}
	@Override
	public Employee getEmpById(Integer empId) {
		Optional<Employee> opt = repo.findByEmpId(empId);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null; 
	}

}
