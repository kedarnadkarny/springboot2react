package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Student;
import com.example.demo.repositories.CollegeRepository;
import com.example.demo.repositories.StudentRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/v2/students")
@Api(value = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CollegeRepository collegeRepository;
	
	@RequestMapping(method=RequestMethod.PATCH, value="/api/addStudent")
	@ApiOperation("/addStudent")
	public ResponseEntity<Student> addStudent(@ApiParam("Id of the person to be obtained. Cannot be empty.") @RequestBody Student student) {
		
		return null;
	}
	
}
