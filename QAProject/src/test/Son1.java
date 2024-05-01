package test;

public class Son1 extends Display {
	
	
	
	public void show() {
	int b	=super.a;
		
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		
		Display ob= new Son1();
		
		ob.method2();
		ob.method3();
		ob.method4();
		
		
		Son1 ob1=new Son1();
		
		ob1.method2();
		ob1.method3();
		ob1.method4();
		ob1.show();
		
	}

}
