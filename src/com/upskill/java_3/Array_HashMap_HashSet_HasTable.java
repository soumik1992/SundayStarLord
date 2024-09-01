package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HasTable {

	public static void main(String[] args) {
		
		//array store multiple data of same type using index
		
		
		int age = 32;			//variable
		int[] ageGroup = new int[]{25,30,32,33,27,21};//Array
		
		//Array Index [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student age: " + ageGroup[3]);
		System.out.println("Total Student: " + ageGroup.length);

		String[] nameGroup = new String[]{"Soumik","Pavel", "Rifat", "Smrity", "Mou", "Rumi"};//Array

		System.out.println("Student Name: " + nameGroup[2]);
		System.out.println("Total Student: " + nameGroup.length);

		for (int i=0; i<nameGroup.length;i++ )
		{
			System.out.println(nameGroup[i] + " ");
		}
		
		//MultiDimentinal array
		int [][] ageGroup2D = {{20,30,21,24,26,27,29},
								{31,32,34,35,36,37,39}};
		
		System.out.println("Student age: " + ageGroup2D[1][3]);

		HashMap<String, Integer> Student =  new HashMap<String, Integer>();
		
		Student.put("Ahsan", 31);
		Student.put("Arovi", 26);
		Student.put("Rasel", 40);
		Student.put("Surovi", 20);
		Student.put("Bador", 19);
		Student.put("Moulovi", 45);
		
		System.out.println("HashMap Student Age " + Student.get("Arovi"));
		
		

		HashMap<String, String> Capital =  new HashMap<String, String>();
		
		Capital.put("England", "London");
		Capital.put("France", "Paris");
		Capital.put("Spain", "Madrid");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("United States", "Washington D.C.");
		
		System.out.println("Capital name for Spain  " + Capital.get("Spain"));
		
		
		//Hashtable store multiple data using key value pair, does not allow null keys or null value, also is synchronized(only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region  : "+ Region.get("BD"));
		
		//HashSet store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car =  new HashSet<>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		
		System.out.println("Car : "+ car);
		
		
		
	}

}
