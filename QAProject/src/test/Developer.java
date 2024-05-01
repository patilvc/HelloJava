package test;
import java.util.Scanner;
public class Developer implements Customer {
	int a;
	int b=200;
	double c=100.23;
	String d;
	
	public void input() {
		
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter first value= ");
		a=ob.nextInt();
		System.out.println("Enter Second value= ");
		b=ob.nextInt();	
		System.out.println("Enter Salary value= ");
		c=ob.nextDouble();
		System.out.println("Enter your name= ");
		d=ob.nextLine();	
	}
	public void output() {
		int c=a*b;
		System.out.println(c);
		}
}
