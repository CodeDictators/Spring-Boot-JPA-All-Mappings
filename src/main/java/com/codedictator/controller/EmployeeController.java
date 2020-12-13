package com.codedictator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedictator.model.Employee;
import com.codedictator.service.EmployeeService;

@RestController
@RequestMapping("/api/demo")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// GetAll
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployee() {
		return employeeService.findAllEmployees();
	}

	// Get
	@GetMapping("/employee/{employeeId}")
	public Employee fetchEmployee(@PathVariable("employeeId") Long employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

	// Post
	@PostMapping("/employee/save")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	// Delete
	@DeleteMapping("/employee/delete/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") Long employeeId) {
		employeeService.deleteEmployee(employeeId);
	}

	// Post
	@PutMapping("/employee/update")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}

}
