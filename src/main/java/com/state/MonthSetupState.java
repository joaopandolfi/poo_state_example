package com.state;

import java.util.Calendar;

public class MonthSetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	private int month;
	
	public MonthSetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
		month = Calendar.getInstance().get(Calendar.MONTH);
	}
	
	public void previousValue() {
		if(month > 1)
			month--;
	}

	public void nextValue() {
		if(month < Calendar.getInstance().getActualMaximum(Calendar.MONTH))
			month++;	
	}

	public String getInstructions() {
		return "Filho digite o mes...";
	}

	public int getSelectedValue() {
		return month;
	}

	public void selectValue() {
		clockSetup.setState(clockSetup.getDaySetupState());
	}
}
