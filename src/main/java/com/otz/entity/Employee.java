package com.otz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="tiger")
public class Employee {
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO) //autoIncrement
	private Integer empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empEmail")
	private String empEmail;
	
	@Column(name="empPass")
	private String empPass;
	
	@Column(name="empAdd")
	private String empAdd;
}
