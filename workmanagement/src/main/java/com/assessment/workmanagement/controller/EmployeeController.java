package com.assessment.workmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.workmanagement.dto.EmployeeDTO;
import com.assessment.workmanagement.model.Employee;
import com.assessment.workmanagement.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("getEmployees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping("updateWorkDays")
	public Employee updateWorkDays(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.updateWorkDays(employeeDTO.getEmployee(), employeeDTO.getWorkDays());
	}

	@PostMapping("updateVacation")
	public Employee updateVacation(@RequestBody EmployeeDTO employeeDTO) {
		return employeeService.updateVacationDays(employeeDTO.getEmployee(), employeeDTO.getVacationTaken());
	}
}
