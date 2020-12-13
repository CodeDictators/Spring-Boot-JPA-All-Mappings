package com.codedictator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedictator.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
