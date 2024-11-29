package com.task;

import java.util.Scanner;

public class Task1 {
	
	void division() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number :");
     	int num=	s.nextInt();
     	
     	 if(num%3==0 && num%5==0 )
     	 {
     		 System.out.println("FIZZ BUZZ");
     	 }
     	 else if (num%5==0)
     	 {
			System.out.println("BUZZ");
		 }
     	 else if(num%3==0)
     	 {
     		System.out.println("FIZZ"); 
     	 }
     	 else
     	 {
     		 System.out.println("Shri");
     	 }
		
	}

}
