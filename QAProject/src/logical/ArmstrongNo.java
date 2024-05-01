package logical;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {

		int n;
		int arm = 0;
		System.out.println("enter any No-");// 153 =1*1*1+5*5*5+3*3*3
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();

		int b = n;
		while (n > 0) {
			int rem = n % 10; // 153/10 =3
			arm = rem * rem * rem + arm;
			n = n / 10;
		}
		if (b == arm) {
			System.out.println("Given number is armstrong No");
		} else {

			System.out.println("Given number is not armstrong No");
		}
	}
}
