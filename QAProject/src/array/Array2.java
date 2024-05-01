package array;

public class Array2 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];// 3=rows ,4=columns
		// [5][4] home work
		a[0][0] = 10;
		a[0][1] = 11;
		a[0][2] = 12;
		a[0][3] = 13;
		a[1][0] = 14;
		a[1][1] = 15;
		a[1][2] = 16;
		a[1][3] = 17;
		a[2][0] = 18;
		a[2][1] = 19;
		a[2][2] = 20;
		a[2][3] = 21;
		int[][] b = { { 50, 52, 53, 50 }, { 51, 57, 52, 53 }, { 52, 32, 44, 42 } }; // 52,32,44,42
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print(b[i][j] + " ");
			}
		}
		System.out.println();
		int c = b[1][2];
		System.out.print(c);
	}
}
