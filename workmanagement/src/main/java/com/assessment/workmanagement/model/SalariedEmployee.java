package com.assessment.workmanagement.model;

public class SalariedEmployee extends Employee {

	public SalariedEmployee() {
		super();
		this.setAccumulatedVacationDays(15f);
	}

	@Override
	public void work(int numberOfDaysWorked) {
		this.setWorkDays(numberOfDaysWorked);
	}

	@Override
	public void takeVacation(float vacationsRemaining) {
		if (vacationsRemaining > 15) {
			vacationsRemaining = 15;
		}
		this.setAccumulatedVacationDays(vacationsRemaining);
	}

}
