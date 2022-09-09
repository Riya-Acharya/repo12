package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student1;

@Repository
public interface Student1Repo extends JpaRepository<Student1,Integer> {

}
