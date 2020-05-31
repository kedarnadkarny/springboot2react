package com.example.demo.listeners;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

import com.example.demo.entities.Student;

public class StudentListener {
	
	@PrePersist
	public void prePersist(Student s) {
		System.out.println("Prepersist- "+s.getName());
	}
	
	@PostPersist
	public void postPersist(Student s) {
		System.out.println("Prepersist- "+s.getName());
	}
}
