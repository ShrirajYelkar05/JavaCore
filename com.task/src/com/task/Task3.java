package com.task;

import java.util.Scanner;

public class Task3 {
	
	void factorial()
	{
		int factorial=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no. :");
		int num=s.nextInt();
		
		for(int i=num;i>=1;i--)
		{
			factorial =factorial*i;
		}
		
		System.out.println(factorial);
		
	}

}
