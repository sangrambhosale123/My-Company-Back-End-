package com.mphasis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.model.Emp;
@Repository
public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
