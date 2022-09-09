package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student1;
import com.example.demo.entity.Student1;
import com.example.demo.repo.Student1Repo;

@Service
public class Student1Service {
@Autowired
private Student1Repo repo;
public void add(Student1 s)
{
	repo.save(s);
	
}
public void updateById(Student1 s1,int id)
{
repo.save(s1);
}



public void delete(int id)
{
	repo.deleteById(id);
}




}
