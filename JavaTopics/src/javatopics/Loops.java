package javatopics;

public class Loops {

	public static void main(String[] args) {

		int i = 1;
		System.out.println("again start" + i + "time");

		/// While loop (print 1 to 10)
		while (i < 11) {
			System.out.println(i);
			i++;
			System.out.println("i is" + i);

		}

		/////////////// do while

		int x = 1;
		do {

			System.out.println(x);
			x++;
		} while (x <= 10);

		////////////////// for loop

		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
			System.out.println("j is" + j);

		}

		//// break in for loop // break come out of entire for loop

		for (int j = 1; j <= 10; j++) {

			if (j == 5) {

				break;
			}

			System.out.println("j is" + j);

		}
		System.out.println("program exited ");

		//// continue >> Directly increament >> Got to next number and continue with for loop
		//// Break and continue can be used for all loops while do while  

		for (int k = 1; k <= 10; k++) {

			if (k == 5) {

				continue;
			}

			System.out.println("k is" + k);

		}
		System.out.println("program exited ");

	}

}
