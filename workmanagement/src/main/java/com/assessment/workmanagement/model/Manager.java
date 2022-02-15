package com.assessment.workmanagement.model;

public class Manager extends Employee {

	public Manager() {
		super();
		this.setAccumulatedVacationDays(30f);
	}

	@Override
	public void work(int numberOfDaysWorked) {
		this.setWorkDays(numberOfDaysWorked);
	}

	@Override
	public void takeVacation(float vacationsRemaining) {
		if (vacationsRemaining > 30) {
			vacationsRemaining = 30;
		}
		this.setAccumulatedVacationDays(vacationsRemaining);
	}

}
