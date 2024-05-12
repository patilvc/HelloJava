package logical;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

		int n;
		int Count = 0;
		System.out.println("enter any no.");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) { 

				Count++; 
			}
		}
		if (Count == 2) {

			System.out.println("Given No is Prime No");
		} else {

			System.out.println("Not Prime No ");
		}

	}

}
