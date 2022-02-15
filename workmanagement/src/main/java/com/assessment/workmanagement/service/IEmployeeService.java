package com.assessment.workmanagement.service;

import java.util.List;

import com.assessment.workmanagement.model.Employee;

public interface IEmployeeService {

	public Employee updateWorkDays(Employee employee, int workDays);

	public Employee updateVacationDays(Employee employee, float vacationTaken);
	
	public List<Employee> getEmployees();

}
