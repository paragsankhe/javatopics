package oops;

public class MethodTypes {

	int a;
	int b;

	// method take params

	void sum(int x, int y) {

		a = x;
		b = y;
		System.out.println(a + b);

	}

	// method may not take params
	void multiply() {
		a = 5;
		b = 9;
		System.out.println(a * b);
	}

	// method return something

	int division(int m, int n) {
		a = m;
		b = n;
		return a / b;
	}
	// method not returns anything

	void modulous(int p, int q) {
		a = p;
		b = q;
		int modulous = a % b;
		System.out.println(modulous);
	}

	public static void main(String[] args) {

		MethodTypes mt = new MethodTypes();
		mt.sum(4, 7);
		mt.multiply();
		int divisior = mt.division(44, 11);
		System.out.println(divisior);
		mt.modulous(22, 33);

	}

}
