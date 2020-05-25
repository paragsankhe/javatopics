package arrayexamples;

public class printgridproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[10][10];

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print("%2d " + a[i][j]);
			}
		}
		System.out.println();
	}

}
