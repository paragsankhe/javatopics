package package2;

import practiseprograms.Employee;

public class OutofpackageClass extends Employee {

	public static void main(String[] args) {
		
		OutofpackageClass emp = new OutofpackageClass();
		emp.empid = 2;
		emp.empname = "jennt";
        emp.empdpetname = "vaxineDEPARTMt";
        
       emp.display();
	}

}
