package practice;

public class Matrix_Addition {
	public static void main(String[] args) {
		int c[][] = new int[2][2];
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		a[0][0] = 14;
		a[0][1] = 15;
		a[1][0] = 22;
		a[1][1] = 10;
		b[0][0] = 32;
		b[0][1] = 25;
		b[1][0] = 12;
		b[1][1] = 56;
		System.out.println("Matrix addition:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");

			}
			System.out.println();

		}

	}
}
