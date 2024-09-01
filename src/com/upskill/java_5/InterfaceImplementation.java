package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
	}

	@Override
	public int iWheels() {
		int wheels =4;
		return wheels;
	}

	@Override
	public String iColor() {
		String color  = "Red";
		
		return color;
	}

}
