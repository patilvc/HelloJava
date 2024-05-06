package exception;

public class StudyThrow1 {

	public static void main(String[] args) {
		
		StudyThrow1  ob = new StudyThrow1();
		
	//	ob.div(12, 0);
		
		try {
			ob.div(12, 0);
		} catch (Exception ee) {

			System.out.println("Dont put 0");
		}
	}
	
	public void div(int a,int b) {
		
		  if (b==0) {
			  
			  throw new ArithmeticException();
		  }
		  else {
			  
			  int c= a/b;
			  System.out.println(c);
		  }
		
	}

}
