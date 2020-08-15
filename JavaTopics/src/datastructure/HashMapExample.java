/*Hashmap stores key-pair 

100 Kiran
200 Raju
300 Sonam
*/

package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Kiran");
		hm.put(200, "Raju");
		hm.put(300, "Sonam");

		for (Map.Entry mtr : hm.entrySet()) {

			System.out.println(mtr.getKey() + "=" + mtr.getValue());
		}

		System.out.println(hm);

		hm.remove(200); // remove specified key / value both
		hm.remove(100, "Kiran");
		System.out.println(hm);
	}

}
