package com.example.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entities.College;

public interface CollegeRepository extends PagingAndSortingRepository<College, Integer> {

}
