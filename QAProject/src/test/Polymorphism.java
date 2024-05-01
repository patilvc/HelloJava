package test;

public class Polymorphism {
	public static void main(String[] args) {	
		//Compile time polymorphism /Static/Early binding	
		Polymorphism ob= new Polymorphism();	
		float d	=ob.addition();
		System.out.println(d);
		ob.addition(100, 100);	
		ob.addition(20, 40.5);
		
		Polymorphism  ob1=new Poly1();//upcasting
	    float g	=ob1.addition();
	    System.out.println(g);
	    ob1.addition(200, 200);		
	//	1)Method overloading ==> Same class
   
		//Run time polymorphism/Dynamic /Late binding
//	    1)Method overriding ==>Different class
	    
	}	
	public float addition() {		
		int a=100;
		float b=30.10f;
		float c=a+b;
		return c;	
	}
	public void addition(int p,int q) {
		
		int r=p+q;
		
		System.out.println(r);	
	}	
    public void addition(int x,double y) {
		
	double z=x*y;	
		System.out.println(z);
		}
}
