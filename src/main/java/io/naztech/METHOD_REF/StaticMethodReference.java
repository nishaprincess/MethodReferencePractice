package io.naztech.METHOD_REF;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */

 class StaticMethodReference {
	 public static  int sum=0,a=2,b=4,d;
	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Method reference
		//list.forEach(StaticMethodReference::print);
		// Lambda expression
		//list.forEach(number -> StaticMethodReference.print(number));
		// normal
		/*for (int number : list) {
			StaticMethodReference.print(number);
		}*/
		list.forEach(StaticMethodReference::ADD);
		System.out.println(sum);
		//list.forEach(System.out::println);
		
		
		
		
	}

	public static void print(final int number) {
		System.out.println("SERIAL NUMBER: " + number);
	}
	public static int ADD(final int number) {
		 sum=sum+number;
		 return sum;
		 
		
	}
	
	
}
