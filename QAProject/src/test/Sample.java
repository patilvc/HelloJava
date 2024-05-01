package test;

public class Sample {

	public static void main(String[] args) {
		
//	test();
//	Sample pune=new Sample();
//	pune.name("Pune");
//	pune.test1();
//	pune.test2();
//	Sample1.addition();
//	//classname objectname =new classname();
//	Sample1 mobile=new Sample1();	
//	//addition(100,300);
int d=ReturnType.addtion(100, 300);
System.out.println(d);
ReturnType ob=new ReturnType();
 int s    =ob.substraction(100, 50);
 
 System.out.println(s);
	
	
	}
	
	public static void test() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("a+b="+c);
	}
	
	public void test1() {
		
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println("a-b="+c);
		
	}
    public void test2() {
		
		int a=10;
		int b=20;
		int c=b*a;
		System.out.println("a*b="+c);
	}
    public static void addition(int a,int b) {
    		System.out.println(a+b);
    }
	public void name (String p) {
		
		System.out.println("name of city="+p+"india");
	}
	

}






























































