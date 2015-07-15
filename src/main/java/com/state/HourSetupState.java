package com.state;

import java.util.Calendar;

public class HourSetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	private int hour;
	
	public HourSetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
		hour = Calendar.getInstance().get(Calendar.HOUR);
	}
	
	public void previousValue() {
		if(hour > 1)
			hour++;
	}

	public void nextValue() {
		if(hour < Calendar.getInstance().getActualMaximum(Calendar.HOUR))
			hour++;
	}

	public String getInstructions() {
		return "Selecione a hora.";
	}

	public int getSelectedValue() {
		return hour;
	}

	public void selectValue() {
		clockSetup.setState(clockSetup.getMinuteSetupState());
	}

}
