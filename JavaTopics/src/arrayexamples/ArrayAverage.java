package arrayexamples;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,5,33,44,5,55};
		
		int sum=0;
		double avg = 0;
		int arrlength =a.length;
		for(int i=0;i<a.length;i++) {
			
			sum = sum + a[i];
		}
System.out.println(sum);
avg = sum / arrlength;
System.out.println("Average of array is " + avg);
	}

}
