package javaintwprograms;

public class CountEvenOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int evencount = 0;
		int oddcount = 0;
		
		for (int i=1;i<=101;i++) {
			
			
			if((i%2)==0) {
				
				evencount++;
			}
			
			else {
				
				oddcount++;
			}
		
		}
		
		
		System.out.println("Even numbers are " + evencount);
		System.out.println("Odd numbers are " + oddcount);
		

	}

}
