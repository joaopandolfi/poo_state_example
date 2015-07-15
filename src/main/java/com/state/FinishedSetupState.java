package com.state;

public class FinishedSetupState implements ClockSetupState{
	private ClockSetup clockSetup;
	
	public FinishedSetupState(ClockSetup clockSetup){
		this.clockSetup = clockSetup;
	}
	
	public void previousValue() {
		// TODO Auto-generated method stub
	}

	public void nextValue() {
		// TODO Auto-generated method stub
		
	}

	public String getInstructions() {
		return "Finished "+ clockSetup.getDaySetupState().getSelectedValue() + "/" +
				clockSetup.getMonthSetupState().getSelectedValue() + "/" + 
				clockSetup.getYearSetupState().getSelectedValue() + " - "+
				clockSetup.getHourSetupState().getSelectedValue() + ":" +
				clockSetup.getMinuteSetupState().getSelectedValue();
	}

	public int getSelectedValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void selectValue() {
	}

}
