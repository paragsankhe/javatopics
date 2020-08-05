
// -- Class with multiple methods with same name 
// -- Differentiate between methods :
// 1.Number of params 2.Order of params 3.Data type of params

package oops;

public class MethodOverloading {

	int a;
	int b;
	int sum;

	void sum() {
		a = 5;
		b = 6;
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		a = x;
		b = y;
		System.out.println(a + b);
	}

	void sum(int x, int y, int z) {

		System.out.println(x + y + z);
	}

	void sum(int x, double y) {

		System.out.println(x + y);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.sum(); // call first method : 11
		mo.sum(100, 200); // call Second method : 300
		mo.sum(5, 6, 7); // call third method : 18
		mo.sum(11, 2.5); // call fourth method

	}

}
