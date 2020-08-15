
/* al.add();
 * al.remove() 
 
  
 */

package datastructure;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList alldata = new ArrayList(); // All data type will be stored

		alldata.add("parag");
		alldata.add(123.22);
		alldata.add(123123);
		alldata.add(false);

		System.out.println("before inserting" + alldata);// inserting value after 2 elements

		alldata.add(2, "iamnew");
		System.out.println("After inserting" + alldata);
		alldata.remove("iamnew");
		System.out.println("Removing value after 2nd element" + alldata);
	}

}
