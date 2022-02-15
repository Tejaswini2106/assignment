package com.assessment.workmanagement.model;

public abstract class Employee {

	private float accumulatedVacationDays;
	private int workDays;

	public abstract void work(int numberOfDaysWorked);

	public abstract void takeVacation(float vacationsUsed);

	public float getAccumulatedVacationDays() {
		return accumulatedVacationDays;
	}

	public void setAccumulatedVacationDays(float accumulatedVacationDays) {
		this.accumulatedVacationDays = accumulatedVacationDays;
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

}
