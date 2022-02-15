package com.assessment.workmanagement.model;

public class HourlyEmployee extends Employee {

	public HourlyEmployee() {
		super();
		this.setAccumulatedVacationDays(10f);
	}

	@Override
	public void work(int numberOfDaysWorked) {
		this.setWorkDays(numberOfDaysWorked);
	}

	@Override
	public void takeVacation(float vacationsRemaining) {
		if (vacationsRemaining > 10) {
			vacationsRemaining = 10;
		}
		this.setAccumulatedVacationDays(vacationsRemaining);
	}

}
