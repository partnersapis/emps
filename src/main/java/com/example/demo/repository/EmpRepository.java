package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{
   public List<Emp> findAll();
}
