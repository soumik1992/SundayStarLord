package com.upskill.java_6;

public class Singleton {
	
	//Singletone is a class that can have only one object
	
	//Private constructor, it prevents any other class from instantiating
	
	private Singleton(){}
	
	private static Singleton SingletonObj =  new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo Method for singletone class");
	}

	

}
