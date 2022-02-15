package com.assessment.workmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.workmanagement.model.Employee;
import com.assessment.workmanagement.model.HourlyEmployee;
import com.assessment.workmanagement.model.Manager;
import com.assessment.workmanagement.model.SalariedEmployee;

@Service
public class EmployeeService implements IEmployeeService {

	private static List<Employee> employees = new ArrayList<>();

	static {
		generateEmployeeData();
	}

	private static void generateEmployeeData() {
		for (int i = 0; i < 10; i++) {
			Employee hourlyEmployee = new HourlyEmployee();
			employees.add(hourlyEmployee);
			Employee salariedEmployee = new SalariedEmployee();
			employees.add(salariedEmployee);
			Employee manager = new Manager();
			employees.add(manager);
		}
	}

	@Override
	public Employee updateWorkDays(Employee employee, int workDays) {
		if (workDays < 0) {
			workDays = 0;
		} else if (workDays > 260) {
			workDays = 260;
		}
		int index = employees.indexOf(employee);
		employee.work(workDays);
		employees.set(index, employee);
		return employee;
	}

	@Override
	public Employee updateVacationDays(Employee employee, float vacationTaken) {
		float remVacationDays = employee.getAccumulatedVacationDays() - vacationTaken;
		if (remVacationDays < 0.0) {
			return employee;
		} else {
			int index = employees.indexOf(employee);
			employee.takeVacation(remVacationDays);
			employees.set(index, employee);
			return employee;
		}
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

}
