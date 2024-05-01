package test;

public class Display {

	  int a=10;	

	private void method1()
	{		
		System.out.println("method 1=Private");
	}	
	 void method2()// if no keyword that means it is default
	{
		 System.out.println("method 2=Default");
	}
	protected  void method3()
	{
		 System.out.println("method 3=protected");
		 
		 System.out.println(this.a);
	}
	public void method4()
	{
		 System.out.println("method 4=public");
	}
	public static void main(String[] args) {
			
		
		Display DC=new Display();
		
		DC.method1();
		DC.method2();
		DC.method3();
		DC.method4();		
	}
}
