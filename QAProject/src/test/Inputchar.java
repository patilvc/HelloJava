package test;
import java.util.Scanner;
public class Inputchar {

	public static void main(String[] args) {
		
		String a;
		int b;
		System.out.println("Please enter name= ");
		Scanner ob=new Scanner (System.in);
		a=ob.next();
	//	a=ob.nextLine();
		
		System.out.println("Please enter number= ");
		b=ob.nextInt();
		System.out.println(a+"    "+b);



	}

}
