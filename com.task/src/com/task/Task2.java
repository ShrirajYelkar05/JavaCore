package com.task;

public class Task2 {
	
	void division2() 
	{
	for(int i=1;i<=30;i++)	
	{
		if(i%3==0 && i%5==0 )
		{
			System.out.println("FIZZ BUZZ");
		}
		 else if (i%5==0)
     	 {
			System.out.println("BUZZ");
		 }
     	 else if(i%3==0)
     	 {
     		System.out.println("FIZZ"); 
     	 }
     	 else 
     	 {
     		 System.out.println(i);
     	 }
	}
	}

}
