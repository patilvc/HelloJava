package test;
import java.util.Scanner;
public class ReverseNo {

	public static void main(String[] args) {
		
		
		int n;
		int r;
		System.out.println("enter any no= ");
		Scanner ob=new Scanner(System.in) ;
		n=ob.nextInt();
		
		while (n>0) {
			
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}
}
