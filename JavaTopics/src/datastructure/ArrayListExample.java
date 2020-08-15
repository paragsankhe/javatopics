/*Limitations of normal array : 1.Same data type 2.Size is fixed/defined 

ArrayList : Data structure, No limit ,Any data type can be stored

ArrayList<String> al = new ArrayList<String>(); // Only String data will be stored -------- Notation 1

ArrayList alldata = new ArrayList(); // All data type will be stored -----------------------Notation 2 
 
  
 */

package datastructure;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(); // Only String data will be stored

		ArrayList alldata = new ArrayList(); // All data type will be stored

		al.add("Pappu");
		al.add("Raju");
		al.add("Sonu");

		alldata.add("parag");
		alldata.add(123.22);
		alldata.add(123123);
		alldata.add(false);

		System.out.println("Arraylist1 elements are" + al);
		System.out.println("Arraylist2 elements are" + alldata);

		for (String str : al) {

			System.out.println(str);
		}

	}

}
