package javaintwprograms;

public class PrintAllPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 0; num <= 1000; num++) {

			int a = num;
			int i = 0;
			int j = 0;

			while (a > 0) {

				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;

			}

			// System.out.println(j);
			if (num == j) {

				System.out.println(num);
			}

		}

	}

}
