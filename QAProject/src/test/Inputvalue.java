package test;
import java.util.Scanner;
public class Inputvalue {

	public static void main(String[] args) {
		
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Enter minimum number= ");
		int a=Scan.nextInt();
		
		System.out.println("Enter maximum number= ");
		int b=Scan.nextInt();
		
		for (int i=a;i<=b;i++) {
			
			if (i%2==0) {
			
			System.out.print(i+" ");
			}
		}
		}
}
