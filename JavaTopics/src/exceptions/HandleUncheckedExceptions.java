package exceptions;

public class HandleUncheckedExceptions {

	public static void main(String[] args) {
		
		
		 int a = 10;
		 
		 System.out.println("program has started");
		 
		 try {
		 
		 System.out.println(a/0);   // ArithmeticException
		 }catch (ArithmeticException e) {
			 
			 System.out.println(e.getMessage());
		 }
		 
		 String str =null;
		 
		 try {
		 System.out.println(str.length()); //NullPointerException
		 
		 }catch(NullPointerException e) {
			 System.out.println(e.getMessage());
			
			 
		 }
		 
		 
		 System.out.println("program in progress");
		 System.out.println("program has completed");
		 
		 

	}
	
	
	
	
	

}
