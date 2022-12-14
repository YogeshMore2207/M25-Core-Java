package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) 
	{
		Set<Integer> obj = new HashSet<>();
		obj.add(45);
		obj.add(55);
		obj.add(22);
		System.out.println(obj);
		
		/*
		 for(Integer i:obj)
		 {
		 	System.out.printl(i+" ");
		 }*/
		//Instead of using looping statement we can extract the set element using one line of Stream API
		
		obj.forEach(System.out::println);
	}

}
