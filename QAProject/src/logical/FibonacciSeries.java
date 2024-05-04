package logical;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

        int n; 
        int a=0;
        int b=1;
        int c;                                 // 1,2,3,5,8,13
   
		Scanner ob= new Scanner(System.in);
		
		n=ob.nextInt();
		
		for (int i=1;i<=n;i++) {
			
			System.out.print(a+ " ,");//0 //1 //1 //2  //3  //5 //8
			
			c=a+b;  //1=0+1 , 2=1+1 , 3=1+2,   5=2+3,      8=3+5,  13=5+8 ,   21=8+13
			a=b;    //a=1, a=1  ,   a=2  ,     a=3,      a=5,     a=8    ,    a=13
			b=c;    //b=1   b=2  ,  b=3   ,    b=5,     b=8,      b=13  ,     b=21
		} 

	}

}
