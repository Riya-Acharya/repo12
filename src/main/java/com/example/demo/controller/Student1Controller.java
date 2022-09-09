package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student1;
import com.example.demo.repo.Student1Repo;
import com.example.demo.service.Student1Service;

@RestController
public class Student1Controller {
	@Autowired
	private Student1Service c;
	@Autowired
	private Student1Repo repo;
	@PostMapping("/add")
	public String data(@RequestBody Student1 x)
	{
		c.add(x);
		return"data added";
	}
	@PutMapping("/updateK/{id}")
	
 
public String update (@RequestBody Student1 p,@PathVariable int id)
{
	try
	{
		Optional<Student1> bn=repo.findById(id);
		if(!bn.isEmpty()) {
			repo.save(p);
			return "Updated";
		}else {
			return "Id does not exist";
		}
	}
	catch(Exception e)
	{
		return e.getMessage();
	}
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable int id)
{
	c.delete(id);
}
}

