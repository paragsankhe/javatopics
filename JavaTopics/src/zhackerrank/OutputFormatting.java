package zhackerrank;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
	
		Scanner scannerstr = new Scanner (System.in);
		
		for(int i=0;i<3;i++) {
			
	
		System.out.println("Enter string");
	   String mystring = scannerstr.next();
		System.out.print("Enter int");
	   int myint = scannerstr.nextInt();
	
	   System.out.printf("%-15s%03d%n",mystring,myint);
		}

	}

}
