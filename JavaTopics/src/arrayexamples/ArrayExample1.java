package arrayexamples;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		String strarray[] = new String[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		strarray[0] = "First";
		strarray[1] = "Second";
		strarray[2] = "third";
		strarray[3] = "Fourth";
		strarray[4] = "Fifth";

		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
			
        for (int i = 0; i <= 4; i++) {
		System.out.println(strarray[i]);
        }
        
        for(int i : a) {
        	
        	System.out.println(i);
        }
        
        
        for(String i : strarray) {
        	
        	System.out.println(i);
        }
        
        
}

}
