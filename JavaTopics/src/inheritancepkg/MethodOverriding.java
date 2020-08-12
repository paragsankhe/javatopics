/* 
 
 Method Overriding : Defining same method in child class which is which is in parent as well. Child class method will override parent method
 
 - Overriding : Defn should be same and atleast 2 class needed
 - overloading : Defn should be different , one class needed 
 
 
*/


package inheritancepkg;

class Bank {

	double rateofintrest;

	double getrateofinterest() {

		return rateofintrest;

	}

}

class Axis extends Bank {

	double getrateofinterest() {

		return rateofintrest;

	}

}

class Sbi extends Bank {

	double getrateofinterest() {

		return rateofintrest;

	}

}

class Icici extends Bank {

	double getrateofinterest() {

		return rateofintrest;

	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		Axis axisobject = new Axis();
		axisobject.rateofintrest = 7.8;
		Sbi sbiobject = new Sbi();
		sbiobject.rateofintrest = 8.8;
		Icici iciciobject = new Icici();
		iciciobject.rateofintrest = 9.8;

		double x = axisobject.getrateofinterest();
		double y = sbiobject.getrateofinterest();
		double z = iciciobject.getrateofinterest();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
