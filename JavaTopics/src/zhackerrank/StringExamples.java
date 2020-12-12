package zhackerrank;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string1");
		String string1 = sc.next();
		System.out.println("enter string2");
		String string2 = sc.next();
		
		System.out.println(string1.length() + string2.length());
		
		
		int result1 = (string1.compareTo(string2));
		int result2 = (string2.compareTo(string1));
		
		if (result1>result2) {
			
			System.out.println("Yes");
		}
		else {
			
			System.out.println("No");
		}
		
		String output1 = string1.substring(0, 1).toUpperCase() + string1.substring(1);
		String output2 = string2.substring(0, 1).toUpperCase() + string2.substring(1);

		
		
		System.out.println(output1 + " " +  output2);

	}

}
