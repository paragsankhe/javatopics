package interfacepkg;

interface InterfaceTest {

	int a = 10; // variable is final and static by default
	int b = 15;

	int getsum(); // only method defn without body >> abstarct method

}

public class InterfaceExample implements InterfaceTest {
	int sum;

	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		System.out.println(obj.getsum());

	}

	@Override
	public int getsum() {

		sum = a + b;
		return sum;
	}

}
