package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		
		car();
		car("grey");
		car(4);
		car(true);
		car("Red", 2);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();

	}
	
//	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override

	public void annualIncomeVoid()
	{
		int calculateAnnualIncome = hourlyIncome*2000;
		int RentalIncome = 40000;
		int SideIncome = 40000;
		int newIncome = calculateAnnualIncome + RentalIncome + SideIncome;
		System.out.println("My New Annual Income is " + newIncome);
	}
	
	//- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload

	public static void car()
	{
		System.out.println("My car is Toyota.");
	}
	
	public static void car(String color)
	{
		System.out.println("My Car is " + color);
	}
	
	public static void car(int seats)
	{
		System.out.println("My car is " + seats +" seats");
	}
	
	public static void car(boolean WD)
	{
		System.out.println("My car is 2WD : " + WD);
	}
	
	public static void car(String color, int seats)
	{
		System.out.println("My car color is "+ color + ", My car is " + seats + " seats");
	}
	

}
