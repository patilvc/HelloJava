package logical;

import java.util.Scanner;

public class sumofoddnoandevenno {

	public static void main(String[] args) {

		int a;
		int sum = 0;

		System.out.println("Enter any no=  ");

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		if (a % 2 == 0) {

			for (int i = 0; i <= a; i=i+2) {

				sum = sum + i;
			}

			System.out.println("sum of even no = " + sum);

		} else {
			for (int i = 1; i <= a; i = i + 2) {

				sum = sum + i;
			}

			System.out.println("Sum of Odd NO = " + sum);

		}

	}

}
