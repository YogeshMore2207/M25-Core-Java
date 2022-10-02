package org.tnsindia.inheritance;

import java.util.Scanner;

//Demo on Single Inheritance

//Parent Class

class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("The Animal is: "+name);
	}
}
class Dog extends Animal
{
	public String breed;
	public void print()
	{
		System.out.println("The Dog Breed is: "+breed);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of animal: ");
		String name1=s.nextLine();
		System.out.println("Enter the name of breed: ");
		String breed1=s.nextLine();
		Dog d=new Dog();
		d.breed=breed1;
		d.name=name1;
		d.display();
		d.print();
		
	}

}
