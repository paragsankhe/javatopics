package interfacepkg;

interface A {
	
	int a = 1;
	int b =2;
	
	void display ();
}


interface B {
	int c = 3;
	int d = 24;
	
	void show ();
	
}



public class MultipleInheritance implements A,B {

	public void display(){
		
		System.out.println(a+b);
	}
	
	public void show (){
		
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		MultipleInheritance mul = new MultipleInheritance();
		mul.display();
		mul.show();

	}

}
