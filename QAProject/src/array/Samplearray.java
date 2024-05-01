package array;

import java.util.Arrays;

public class Samplearray {

	public static void main(String[] args) {

		int[] a = { 10, 12, 52, 17, 5, 92, 73, 2 };
		int[] b = { 100, 200 };
		System.out.println(a[1] * b[1]);
		String[] firstname = { "pune ", "mumbai", "Solapur", "kolhapur" };

		System.out.println(firstname.length);
		for (int i = 0; i < 4; i++) {

			System.out.print(firstname[i] + " ");
		}
		
		System.out.println();
		
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int j = a.length - 1; j >= 0; j--) {

			System.out.print(a[j] + " ");
		}
//		for (int i = ar.length - 1; i >= 0; i--) {
//			System.out.print(ar[i] + " ");
//		}
	}

}
