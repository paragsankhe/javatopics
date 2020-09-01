package zhackerrank;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scaneer = new Scanner (System.in);
		
		System.out.println("Enter your number1");
		
		
		int number1 = scaneer.nextInt();
		System.out.println("Enter your number21");
		int number2 = scaneer.nextInt();
		System.out.println("Enter your number3");
		int number3 = scaneer.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		scaneer.close();

	}

}
