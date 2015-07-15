package com.state;

public interface ClockSetupState {

	public void previousValue();
	public void nextValue();
	public String getInstructions();
	public int getSelectedValue();
	public void selectValue();
	
}
