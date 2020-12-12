package javaintwprograms;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner get = new Scanner(System.in);
		int n, i = 0;
		n = get.nextInt();

		while (n > 0) {

			n = n / 10;
			i++;
		}

		System.out.println("Counrt of disgits " + i);

	}

}
