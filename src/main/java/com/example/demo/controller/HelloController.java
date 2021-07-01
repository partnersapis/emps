package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Emp;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("api")
public class HelloController {

	@Autowired
	DemoService d1;

	@GetMapping("hello")
	public String sayHello()
	{
		return "Welcome to Spring API";
	}
	
	@GetMapping("getemps")
	public List<Emp> getAllEmpoyees()
	{
	 return d1.getEmployees();	
	}
	@PostMapping("NewEmp")
	public Emp addEmp(@RequestBody Emp e)
	{
		d1.addEmp(e);
		return e;
	}	 
}
