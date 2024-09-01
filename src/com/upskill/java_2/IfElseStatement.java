package com.upskill.java_2;

public class IfElseStatement {
	
	public static void main (String []args){
		int age= 15;
		
		if(age<=13)
			{System.out.println("You are a child!");}
		
		else if(age>=13 && age<=19)
			{System.out.println("You are teenager!");}
		else if(age>60)
			{System.out.println("You are a senior Citizen!");}
		else{System.out.println("You are an adult!");}
	}

}
