package javaintwprograms;

public class PrintAllAmstrongNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 1;num<=1000;num++) {
			
			
			int a = num;
			int i = 0;
			int j = 0;

			while (a > 0) {

				i = a % 10;
				j = (i * i * i) + j;
				a = a / 10;

			}

			if (num == j) {

				System.out.println(j);
			}
			
			
		}

	}

}
