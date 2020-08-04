

//Initializing class variable values by object

package oops;

public class Employee {

	String empname;
	int empsalary;
	int empage;
	int empdeptnum;

	void display() {

		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empage);
		System.out.println(empdeptnum);
	}

	public static void main(String[] args) {
       
		Employee emp1 = new Employee();
		emp1.empname = "Parag";
		emp1.empage = 29;
		emp1.empdeptnum = 3;
		emp1.empsalary = 100000;
		
		emp1.display();
	}

}
