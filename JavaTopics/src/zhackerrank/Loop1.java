/*Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.


*/

package zhackerrank;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {

		// creating a Scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("Enter any number from 2 to 20 : ");

		// read an int value
		int number = input.nextInt();
		int result;

		if (number >= 2 && number < 21) {

			for (int i = 1; i <= 10; i++) {

				result = number * i;
				System.out.println(number + "x" + i + "=" + result);

			}

			input.close();

		} else {

			System.out.println("enter number as per range ");
		}

	}

}
