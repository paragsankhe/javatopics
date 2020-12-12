package javaintwprograms;

import java.util.Scanner;

public class AmstrongNumberCheck {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int num = sc.nextInt();

			int a = num;
			int i = 0;
			int j = 0;

			while (a > 0) {

				i = a % 10;
				j = (i * i * i) + j;
				a = a / 10;

			}

			if (num == j) {

				System.out.println("Its amstrong number ");
			}

			else {
				System.out.println("Its NOT an amstrong number ");

			}

		}
	}

}
