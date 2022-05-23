package com.mphasis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.model.Emp;
import com.mphasis.services.EmpService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmpService empService;


	@GetMapping("/employees")
	public List<Emp> showEmp(){
		return empService.getAll();
	}
	@GetMapping("/employee/{eno}")
	public Emp getEmployee(@PathVariable("eno") int eno) {
		return empService.getEmployee(eno);
	}
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Emp emp) {
		empService.addEmployee(emp);
	}
	@DeleteMapping("/employee/{eno}")
	public void deleteEmployee(@PathVariable("eno") int eno) {
		empService.deleteEmployee(eno);
	}
}
