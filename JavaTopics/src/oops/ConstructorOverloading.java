/*Constructor : (Default and parametrized)
	- Spl kind of method 
	- name should be same as classname
	- will not return any value
	- will be invoked at time of object creation / no need to explicit invoke
	- can take params like method
	- used only to initialize values 
	
Differentiate 1.Number of params ,Order of params and datatype of params */

package oops;

public class ConstructorOverloading {

	int a;
	int b;
	double c;

	ConstructorOverloading() {

		a = 10;
		b = 15;
		c = 1.1;

	}

	ConstructorOverloading(int x, int y) {

		a = x;
		b = y;

	}

	ConstructorOverloading(int x, double y) {

		a = x;
		c = y;

	}

	ConstructorOverloading(int x, int y, double z) {

		a = x;
		b = y;
		c = z;

	}
	
	void display () {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(2,3);
		ConstructorOverloading c3 = new ConstructorOverloading(3,8.8);
		ConstructorOverloading c4 = new ConstructorOverloading(1,2,3.3);
	    c1.display();
	    c2.display();
	    c3.display();
	    c4.display();
	    

	}

}
