package com.state;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	ClockSetup clockSetup;
	
	@Before
	public void before(){
		clockSetup = new ClockSetup();
	}
	
	@Test
	public void test1(){
		clockSetup.pushKnob();
		clockSetup.pushKnob();
		clockSetup.pushKnob();
		clockSetup.pushKnob();
		clockSetup.pushKnob();
		Assert.assertEquals("Finished "+Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"/"+
				Calendar.getInstance().get(Calendar.MONTH)+"/"+
				Calendar.getInstance().get(Calendar.YEAR)+" - "+
				Calendar.getInstance().get(Calendar.HOUR)+":"+
				Calendar.getInstance().get(Calendar.MINUTE)
				, clockSetup.getFinishedSetupState().getInstructions());
	}
}
