package com.mphasis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.model.Emp;
import com.mphasis.repositories.EmployeeRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmployeeRepository empRepository;
	

	@Override
	public List<Emp> getAll() {
		return empRepository.findAll();
	}

	@Override
	public Emp getEmployee(int eno) {
		return empRepository.findById(eno).orElse(null);
	}

	@Override
	public void addEmployee(Emp emp) {
		empRepository.save(emp);
	}

	@Override
	public void deleteEmployee(int eno) {
		empRepository.deleteById(eno);
	}

}
