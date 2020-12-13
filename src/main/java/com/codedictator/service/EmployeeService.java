package com.codedictator.service;

import java.util.List;

import com.codedictator.model.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee person);

	public List<Employee> findAllEmployees();

	public Employee getEmployeeById(Long employeeId);

	public void deleteEmployee(Long employeeId);

	public void updateEmployee(Employee employee);

}
