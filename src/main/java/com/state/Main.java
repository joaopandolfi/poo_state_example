package com.state;

public class Main 
{
    public static void main( String[] args ){
    	
    	ClockSetup clockSetup = new ClockSetup();
    	
    	clockSetup.rotateKnobRight();
    	clockSetup.rotateKnobRight();
    	clockSetup.pushKnob();
    	
    	clockSetup.rotateKnobRight();
    	clockSetup.pushKnob();
    	
    	clockSetup.rotateKnobLeft();
    	clockSetup.pushKnob();
    	
    	clockSetup.rotateKnobLeft();
    	clockSetup.pushKnob();
    	
    	clockSetup.rotateKnobLeft();
    	clockSetup.pushKnob();
    }
}
