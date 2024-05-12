package logical;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {

		// n=6
		// 1+2+3=6
		int n;
		int sum = 0;
		

		System.out.println("enter any no.=");

		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		int c=n;
		for (int i = 1; i < n; i++) {  //1   //2  //3 //4 //5 

			if (n % i == 0) {

				sum = sum + i; //1   //3  //3+3=6
			}
		}
		if (c == sum) {

			System.out.println("It is Perfect no.");
		} else {

			System.out.println("Not Perfect no.");
		}
	}

}
