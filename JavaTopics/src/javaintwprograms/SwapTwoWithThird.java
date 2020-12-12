package javaintwprograms;

import java.util.Scanner;

public class SwapTwoWithThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		
	int c= a;
	a=b;
	b=c;
		
		System.out.println("Numbers after swapping are" + a + "And "+ b);
	}

}
