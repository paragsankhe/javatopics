/*Static 
========================================
1 Static means shared across objects to avoid duplication and re-usability to save memory location Eg. Employee Class deptno 
2 variables and methods can be static 
3 As its shared then if changed by one object can change for all other instances/objects
4.Static variables and methods can be accessed by Class name directly  without creating object 

Accessing static and non static stuff :
1. Static methods can access only static stuff directly (without object)
2. Static methods can access non static stuff by object creation 
3. Non static methods can access everything directly without object 
*/

package oops;

public class StaticExample {

	static int a; // static variable
	int b; // non static variable

	// static method

	static void m1() {
		a = 10;

		System.out.println("this is static method");

	}

	// non static method  can access everything directly. (static and non static without need of object)
	void m2() {
		a = 5;
		b = 5;
		m1();
		
		System.out.println("this is Non static method");
	}

	public static void main(String[] args) {
        a=10;
		m1(); // static stuff can be called directly in static method
		StaticExample se = new StaticExample();
		se.m2(); // non static stuff can be accessed only with object in static method
		se.b=11;
	}

}
