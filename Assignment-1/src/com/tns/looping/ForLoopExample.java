package com.tns.looping;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}

	}

}
