package com.state;

import java.util.Calendar;

import com.state.ClockSetup;
import com.state.ClockSetupState;

public class MinuteSetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	private int minute;
	
	public MinuteSetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
		minute = Calendar.getInstance().get(Calendar.MINUTE);
	}
	
	public void previousValue() {
		if(minute > 1)
			minute--;
	}

	public void nextValue() {
		if(minute < Calendar.getInstance().getActualMaximum(Calendar.MINUTE))
			minute++;
	}

	public String getInstructions() {
		return "Escolha o minuto.";
	}

	public int getSelectedValue() {
		return minute;
	}

	public void selectValue() {
		clockSetup.setState(clockSetup.getFinishedSetupState());
	}

}
