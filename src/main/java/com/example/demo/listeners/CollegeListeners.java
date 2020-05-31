package com.example.demo.listeners;

import javax.persistence.PrePersist;

import com.example.demo.entities.College;
import com.example.demo.entities.Student;

public class CollegeListeners {

	@PrePersist
	public void prePersist(College college) {

	}
}
