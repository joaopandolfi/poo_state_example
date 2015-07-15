package com.state;

import java.util.Calendar;

public class DaySetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	private int day;
	
	public DaySetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}
	
	public void previousValue() {
		if(day >1 )
			day--;
	}

	public void nextValue() {
		if(day < Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH))
			day++;
	}

	public void selectValue() {
		clockSetup.setState(clockSetup.getHourSetupState());
	}

	public String getInstructions() {
		return "Filho, escolhe um dia";
	}

	public int getSelectedValue() {
		return day;
	}


}
