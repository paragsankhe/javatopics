package arrayexamples;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,12,11,44,33,22};
		String strarr[] = {"sdasds","adfsdfdf","zasdda"};
		Arrays.sort(a);
		Arrays.sort(strarr);
		for (int i : a) {
			
			System.out.println(i);
		}
		
for (String i : strarr) {
			
			System.out.println(i);
		}


	}

}
