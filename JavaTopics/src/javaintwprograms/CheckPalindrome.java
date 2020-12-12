package javaintwprograms;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		while(true) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();

		int a = n;
		int i = 0;
		int j = 0;

		while (a > 0) {

			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;

		}

		// System.out.println(j);
		if (n == j) {

			System.out.println("Number is palindrome");
		}

		else {
			System.out.println("Number is NOT palindrome");

		}

	}
	}

}
