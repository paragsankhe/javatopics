/*final method,variable,class 
- final variable is constant , can not be channged once initiated 
- final method can not be overriden in child class
- final class can not be extended by child class 


*/

package interfacepkg;

class Test {

	final int a = 10;

	final void display() {

		System.out.println("its parent class method ");

	}

}
// final class can not be extended

class Child extends Test {

	/*
	 * Final method can not be overriden void display() {
	 * 
	 * System.out.println("its child class method ");
	 * 
	 * }
	 */

}

public class FinalExample {

	public static void main(String[] args) {

		Test tobj = new Test();
// tobj.a = 100;  final variable value can not be changed , its constant 

		Child cobj = new Child();
		cobj.display();
	}

}
