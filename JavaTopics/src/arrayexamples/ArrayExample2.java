package arrayexamples;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };
		String strarr[] = { "First", "Second", "Third", "fourth" };

		int sum = 0;
		for (int i = 0; i <a.length; i++) {

			sum = sum + a[i];
			System.out.println(a.length);
		}
		System.out.println("sum is " + sum);

		for (String i : strarr) {

			System.out.println(i);
		}

	}

}
