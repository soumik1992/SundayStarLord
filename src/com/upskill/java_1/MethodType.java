package com.upskill.java_1;

public class MethodType {
	
	/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */

	//comment to commit
	public static int hourlyIncome = 65 ;
	public static void main(String[] args) {
		
		System.out.println(hourlyIncome);
		
	}

	//Void Method
	public void annualIncomeVoid(){
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My annual Income = " + calculateAnnualIncome);
		
	}
	
	//Return Method
	public static int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 160;
		return calculateMonthlyIncome;
		
	}
	
}
