package com.state;

import com.view.View;

public class ClockSetup {
	ClockSetupState currentState;
	YearSetupState yearState;
	MonthSetupState monthState;
	DaySetupState dayState;
	HourSetupState hourState;
	MinuteSetupState minuteState;
	FinishedSetupState finishedState;
	
	
	public ClockSetup(){
		yearState = new YearSetupState(this);
		monthState = new MonthSetupState(this);
		dayState = new DaySetupState(this);
		hourState = new HourSetupState(this);
		minuteState = new MinuteSetupState(this);
		finishedState = new FinishedSetupState(this);
		
		
		//Seta estado inicial
		setState(yearState);
	}
	
	public void setState(ClockSetupState state){
		currentState = state;
		View.showInstructions(currentState.getInstructions());
	}
	
	public void rotateKnobLeft(){
		currentState.previousValue();
	}
	
	public void rotateKnobRight(){
		currentState.nextValue();
	}
	
	public void pushKnob(){
		currentState.selectValue();
	}
	
	//Getters
	
	public YearSetupState getYearSetupState() {
		return yearState;
	}

	public MonthSetupState getMonthSetupState() {
		return monthState;
	}

	public DaySetupState getDaySetupState() {
		return dayState;
	}

	public HourSetupState getHourSetupState() {
		return hourState;
	}

	public MinuteSetupState getMinuteSetupState() {
		return minuteState;
	}

	public FinishedSetupState getFinishedSetupState() {
		return finishedState;
	}
	
	
}
