package com.assessment.workmanagement.dto;

import com.assessment.workmanagement.model.Employee;

public class EmployeeDTO {

	private Employee employee;

	private int workDays;

	private float vacationTaken;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public float getVacationTaken() {
		return vacationTaken;
	}

	public void setVacationTaken(float vacationTaken) {
		this.vacationTaken = vacationTaken;
	}

}
