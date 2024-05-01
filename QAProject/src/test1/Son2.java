package test1;

import test.Display;

public class Son2 extends Display {

	public static void main(String[] args) {


		Display ob1=new Display();	
		ob1.method4();	
		
		Son2 ob2=new Son2();	
		ob2.method3();
		ob2.method4();
		
		Display ob3=new Son2(); 	
		ob3.method4();
	}
	


}
