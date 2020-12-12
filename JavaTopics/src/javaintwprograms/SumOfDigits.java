package javaintwprograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		int num = sc.nextInt();

		int a = num;
		int i = 0;
		int j = 0;

		while (a > 0) {

			i = a % 10;
			j = j + i;

			a = a / 10;
		}

		System.out.println("Sum of digits " + j);
	}

}
