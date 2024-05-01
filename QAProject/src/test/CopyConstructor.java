package test;

public class CopyConstructor {
	int a;
	int b;
	CopyConstructor(){
		 a=50;
		 b=100;
		
		System.out.println(a+" "+b);
	}
	CopyConstructor(CopyConstructor ref){
		
		int P=ref.a;
		int Q=ref.b;	
		System.out.println(P+" "+Q);			
	}
}
