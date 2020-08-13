/*Handling checked exceptions :

1.try..catch block : statement level 
2.throws keyword : method level

*/

package exceptions;

public class HandleCheckedExceptions {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program started ");

		try {

			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.getMessage();
		}

		System.out.println("Program in progress ");
		Thread.sleep(123);

		System.out.println("Program ended ");

	}

}
