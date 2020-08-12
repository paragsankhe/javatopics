/*private : method and variable : accessible only within class 
default : method and variable :accessible  within package 
protected : method and variable :accessible within packge , and outside package only by inheritance 
public : accessible by anywhere. 
	
*/

package accessModifiers;

class A {

	private int a = 3;

	private void m1() {

		System.out.println(a);
	}
}

class B {
	int d = 3;

	void m1() {

		System.out.println(d);
	}

}

public class AccessModifiersExample {

	public static void main(String[] args) {
		A a = new A();
		// a.m1(); can not acces as its private , can vaiable and methods can be accesed
		// within clas only
		// a.a

		B b = new B();
		System.out.println(b.d); /// default variable and methods can be accesed within package
		b.m1();
	}

}
