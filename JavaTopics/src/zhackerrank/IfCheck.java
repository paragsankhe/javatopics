/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints



*/

package zhackerrank;

import java.util.Scanner;

public class IfCheck {

	public static void main(String[] args) {

		Scanner scaneer = new Scanner(System.in);

		System.out.println("Enter n ");

		int n = scaneer.nextInt();

		if (n >= 1 && n <= 100) {

			if ((n % 2) == 0) {

				if (n <= 5 && n >= 2) {

					System.out.println("Not Weird");

				}

				if (n <= 20 && n >= 6) {

					System.out.println(" Weird");

				}
				if (n > 20) {

					System.out.println(" Not Weird");

				}

			}

			else {

				System.out.println("Weird");
			}

		}
	}

}
