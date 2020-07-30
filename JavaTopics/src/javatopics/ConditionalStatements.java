package javatopics;

public class ConditionalStatements {

	public static void main(String[] args) {

		// if

		int age = 18;
        int day = 19;
        int dayn = 2 ;
		if (age > 18) {

			System.out.println("You are eligible to vote");
		}

		// If else

		if (age > 18) {

			System.out.println("You are eligible to vote");
		}

		else {

			System.out.println("You are nottt eligible to vote");
		}
		
		
		// Nested If else 
		
		if(day==1) {
			
			 System.out.println("Today is Monday");
		}
		
		else if(day==2) {
			
			 System.out.println("Today is tuesday");
		}
		else if(day==3) {
			
			 System.out.println("Today is tuesday");
		}
		
		else {
			
			System.out.println("Select valid number ");
		}
		
		//SWITCH case 
		
		
		switch (dayn) {
		
		case 1 : System.out.println("today is monday");break;
		case 2 : System.out.println("today is tuday");break;
		case 3 : System.out.println("today is wday");break;
		default :System.out.println("enter valid number");break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
