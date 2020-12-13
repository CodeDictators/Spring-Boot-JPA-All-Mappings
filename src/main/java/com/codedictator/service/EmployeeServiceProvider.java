package com.codedictator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedictator.model.Employee;
import com.codedictator.repository.EmployeeRepo;

@Service
public class EmployeeServiceProvider implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {
		Optional<Employee> employee = employeeRepo.findById(employeeId);
		if (employee.isPresent())
			return employee.get();
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepo.deleteById(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepo.save(employee);
	}

}
