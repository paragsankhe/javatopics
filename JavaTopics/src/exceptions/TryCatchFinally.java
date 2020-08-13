/*1.Exception occurs,catch block handles , finally block executes
2.Exception occurs,catch block can not handles , finally block executes
3.Exception not occurs,catch block ignores , finally block executes*/

package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {

		int arr[] = new int[3];
		arr[0] = 5;
		arr[1] = 5;
		arr[2] = 5;

		//Exception occurs,catch block handles , finally block executes
		
		try {

			System.out.println(arr[3]); // ArrayIndexOutOfBoundException
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("array index check not proper");
			System.out.println(e.getMessage());
		}
		
		finally {
			
			System.out.println("Finally executed ");
		}
		
		
	// 	Exception occurs,catch block can not handles , finally block executes
		try {

			System.out.println(arr[3]); // ArrayIndexOutOfBoundException
		} catch (NullPointerException e) {

			System.out.println("array index check not proper");
			System.out.println(e.getMessage());
		}
		
		finally {
			
			System.out.println("Finally executed ");
		}
		
		System.out.println("program exited");

	


	}
	
	
	

}
