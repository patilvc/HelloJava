package array;

public class Foreachloop {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (Object b : a) {

			System.out.print(b + " ");
		}

		System.out.println();

		String[] c = { "Pune", "Solapur", "mumbai", "Thane" };

		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i] + " ");
		}

		System.out.println();
		for (Object b : c) {

			System.out.print(b + " ");
		}

	}

}
