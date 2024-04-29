package com.example.saranq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saranq2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
