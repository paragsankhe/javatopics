
//Initializing class variable values by constructor
package oops;

public class Employee2 {
	
	String empname;
	int empsalary;
	int empage;
	int empdeptnum;

	Employee2(String name,int salary,int age,int dptnum){
		
		empname = name;
		empsalary = salary;
		empage=age;
		empdeptnum= dptnum;
	}
	
	void display() {

		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empage);
		System.out.println(empdeptnum);
	}
	
	
	public static void main(String[] args) {
	       
		Employee2 emp1 = new Employee2("Raju",2000,3,3);
		Employee2 emp2 = new Employee2("Rohan",4000,7,3);
		emp1.display();
		emp2.display();
	
	}

}
