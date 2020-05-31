package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.listeners.CollegeListeners;

import lombok.Data;

@Data
@Entity
@EntityListeners(CollegeListeners.class)
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	@OneToMany(mappedBy="college", cascade = CascadeType.ALL)
	private List<Student> students;
}
