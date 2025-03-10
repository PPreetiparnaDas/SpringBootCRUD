package com.otz.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="BookTable")
public class Book {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) //autoIncrement
	private Integer bookId;
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="bookAuthorName")
	private String bookAuthorName;
	
	@Column(name="insb")
	private String insb;
	
	@CreationTimestamp
	@Column(name="createdDate",updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name="updatedDate",insertable = false)
	private LocalDate updatedDate;
}
