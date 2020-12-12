package javaintwprograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enternumber ");
			int num = sc.nextInt();

			int a = num;
			int i = 0;
			int j = 0;

			while (a > 0) {

				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;

			}

			System.out.println("revers of " + num + "is " + j);

		}
	}

}
