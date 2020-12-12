/*Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

A<B<Z<a<z


string1.compareTo(string2) >> If string1 value is greatet than str2 then it will retrn integer greater than 0 (it retrns hw great s1 value is by s2 )


*/

package zhackerrank;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ");
		String s1 = sc.next();

		System.out.println("Enter start  ");
		int start = sc.nextInt();

		System.out.println("Enter end  ");
		int end = sc.nextInt();

		System.out.println(s1.substring(start, end));

	}

}
