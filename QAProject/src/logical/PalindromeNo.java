package logical;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {

		// 123321
		// 121
		// 156651

		int n;
		int rem;
		int b = 0;
		System.out.println("enter any no.=");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int c = n;
		while (n > 0) {  // 121>0

			rem = n % 10;     //rem=1      rem=2           rem=1
			b = b * 10 + rem; //b=1      //1*10+2=12    //12*10+1=121
			n = n / 10;
		}
		if (c == b) {

			System.out.println("Given no is Palindrome No");
		} else {
			System.out.println("not Palindrome No");
		}

	}

}
