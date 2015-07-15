package com.state;

import java.util.Calendar;

public class YearSetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	private int year;
	
	public YearSetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
		year = Calendar.getInstance().get(Calendar.YEAR);
	}
	
	public void previousValue(){
		year--;
	}
	
	public void nextValue(){
		year++;
	}
	
	public void selectValue(){
		clockSetup.setState(clockSetup.getMonthSetupState());
	}
	
	public String getInstructions(){
		return "Filho, insira o ano...";
	}
	
	public int getSelectedValue(){
		return year;
	}
}
