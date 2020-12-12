/*
	Convert int to String 
	
	1. String.valueOf(int)
	2. Integer.toString(int)
		
*/



package zhackerrank;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter number ");
		int number = scanner.nextInt();
		
	String s	=String.valueOf(number);
		
		System.out.println(s);
	

	}

}
