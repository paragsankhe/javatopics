package arrayexamples;

public class TwoDimArrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[2][3];
		
		 a[0][0] = 10;
		 a[0][1] = 20;
		 a[0][2] = 30;
		 
		 a[1][0] = 40;
		 a[1][1] = 50;
		 a[1][2] = 60;
		 
		 for (int i[] : a) {
			 
			 for (int j : i) {
				 System.out.print(j +" ");
			 }
			 System.out.println();
		 }
	}

}
