package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		
		practiceForLoop();
		
		practiceWhileLoop();
		
		practiceDoWhileLoop();
	}
		//comment to git changes
		
		public static void practiceForLoop()
		{
			for (int i=1; i<=10; i++)
				{
				System.out.println("Print number "+ i);
				}
		}
		
		public static void practiceWhileLoop()
		{
			int i = 1;
			while (i<=10)
			{System.out.println("Print "+ i);
			i++;
			}
			
		}
		
		public static void practiceDoWhileLoop()
		{
			int i = 1;
			do{ System.out.println("Print for " + i);
			i++;}
			while (i<=10);
		}
		
		
	

	

}
