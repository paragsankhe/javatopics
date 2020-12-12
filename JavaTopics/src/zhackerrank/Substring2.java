package zhackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Substring2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	//	 System.out.println("Enter string ");
		String s1 = sc.next();
	//	System.out.println("Enter number k ");
		int k = sc.nextInt();

		int stringlength = s1.length();

		List<String> list = new ArrayList();
		int count = 0;
		int i = 0;
		int j = k;

		do {

			list.add(s1.substring(i, j));

			i++;
			j++;
			count++;
		} while (count < ((stringlength - k) + 1));

		for (int z = 0; z < count; z++) {
		//	 System.out.println(list.get(z));
		}

//		 System.out.println("Before sort");
		Collections.sort(list);

		for (int z = 0; z < count; z++) {
	//		 System.out.println(list.get(z));
		}

		System.out.println(list.get(0));
		System.out.println(list.get((list.size() - 1)));

	}

}
