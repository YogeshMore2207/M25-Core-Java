package com.tns.decisionmaking;
//Example of Cascaded If-Else 
import java.util.Scanner;

public class Demo2{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		
		s.close();

	}

}
