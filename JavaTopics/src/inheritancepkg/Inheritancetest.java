/* 
  - Aquiring methods and variables from parent/Super/Base class to child/subclass/derived class for reusing purpose 
  
  Types of inheritance :
  1. Single : A to B 
  2. Multilevel : A to B to C 
  3. Multiple : C from A and B  >>> Not possible by class  (Interface)
  4. Hierarchical : A to B and C 
  5. Hybrid : D to A nd B to C  >> Not possible by class  (Interface)
   
   
*/

package inheritancepkg;

class A {

	int a;
	int b;

	void display() {

		System.out.println(a + b);
	}
}

class B extends A {

	int x;
	int y;

	void show() {

		System.out.println(x + y);

	}

}

class C extends B {

	int m;
	int n;

	void sum() {

		System.out.println(m + n);

	}

}

public class Inheritancetest {

	public static void main(String[] args) {

	

		C cobj = new C();
		cobj.a = 3;
		cobj.b = 4;
		cobj.x = 5;
		cobj.y = 6;
		cobj.m = 7;
		cobj.n = 9;

		cobj.sum();
		cobj.display();
		cobj.show();

	}

}
