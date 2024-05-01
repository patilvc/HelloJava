package test;

public class Casting {

	public static void main(String[] args) {
		
	//****** Implicit *********//	
		byte a =10;
		short b;
		int c;
		long d;
		float f;
		double e;	
		b=a;
		c=a;
		d=a;
		f=a;
		e=a;
    System.out.println("short="+b);
    System.out.println("int="+c);
    System.out.println("long="+d);
    System.out.println("float="+f);
    System.out.println("double="+e);
    
  //****** Explicit *********//  
    int z=20;
    byte x;
    x=(byte)z;   
    float p =40.8f;
    int q;    
    q=(int)p;  
    System.out.println("byte="+x);
    System.out.println("int ="+q);   
	}
}
