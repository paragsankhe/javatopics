//Initializing class variable values by setter methods // getter setter

package oops;

public class Employee3 {

	String empname;
	int empsalary;
	int empage;
	int empdeptnum;

	void getData() {

		System.out.println(empname);
		System.out.println(empsalary);
		System.out.println(empage);
		System.out.println(empdeptnum);
	}
	
	void setData(String name,int salary,int age,int dptnum) {
		
		empname = name;
		empsalary = salary;
		empage=age;
		empdeptnum= dptnum;
		
	}
	
	public static void main(String[] args) {
	       
		Employee3 emp1 = new Employee3();
		emp1.setData("Romaa", 10000, 3, 123);
		emp1.getData();
	    
		
	}

}
