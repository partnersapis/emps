package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Emp;
import com.example.demo.repository.EmpRepository;

@Service
public class DemoService {
	@Autowired
	EmpRepository e1;
	

	public List<Emp> getEmployees()
	{
		return e1.findAll();
	}
	public Emp addEmp(Emp e) {
		e1.save(e);
		return e;
	}
}
