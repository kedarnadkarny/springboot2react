package com.example.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
