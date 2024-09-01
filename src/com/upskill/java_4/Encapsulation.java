package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name  = "Upskill"; //Write & read
	
	private int ssn = 797879605; //Write only
	
	private String userName = "soumikislam"; //Read only

	//Setter Method - name				//set the data, Write
	public void setName(String value)
	{
		name = value;
	}
	
	//Getter Method - Name			//Get the data, Read
	public String getName()
	{
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value)
	{
		ssn =  value;
	}
	
	//Getter Method - UserName
	public String getUserName()
	{
		return userName;
	}
	
	private String address  = "77 Jamaica Avenue, NYC"; // Write and read
	
	private int dob = 0101; 		//Write only

	private int dl =  45654313;		//Read only
	
	public void setAddress(String value)
	{
		address = value;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setDob(int value)
	{
		dob = value;
	}
	
	public int getDL()
	{
		return dl;
	}
	
	
	
	

}
