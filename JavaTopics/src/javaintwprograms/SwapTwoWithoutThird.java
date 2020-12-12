package javaintwprograms;

import java.util.Scanner;

public class SwapTwoWithoutThird {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();

		a = a = b;
		b = a - b;
		a = a - b;

		System.out.println("Numbers after swapping are" + a + "And " + b);

	}

}
