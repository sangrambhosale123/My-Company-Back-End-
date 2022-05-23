package com.mphasis.services;

import java.util.List;

import com.mphasis.model.Emp;

public interface EmpService {
	public List<Emp> getAll();
	public Emp getEmployee(int eno);
	public void addEmployee(Emp emp);
	public void deleteEmployee(int eno);
}
