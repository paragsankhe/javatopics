package javaintwprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		while(true) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enternumber ");
		int num = sc.nextInt();
		int factnum = 1;

		for (int i = 1; i <= num; i++) {

			factnum = factnum * i;

		}
		System.out.println(factnum);
}
	}

}
