/*Unchecked Exceptions : Not identified by compiler 
-- ArithmeticException
-- NullPointerException
-- NumberFormatException
-- ArrayIndexOutOfBoundException*/


package exceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {
	
		
	 int a = 10;
	 System.out.println(a/0);   // ArithmeticException
	 
	 String str =null;
	 System.out.println(str.length()); //NullPointerException
	 
	 String nomnom = "12345";
	 System.out.println(Integer.parseInt(nomnom));  
	 
	 String abc = "moonmoon" ;
	 System.out.println(Integer.parseInt(abc));  // NumberFormatException
	 
		int arr[] = new int [3];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;
		
		 System.out.println(arr[3]);  //ArrayIndexOutOfBoundException

	}

}
