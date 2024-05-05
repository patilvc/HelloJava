package exception;

public class SampleException1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 0, 8, 9 };
		int b = 0;
		int c = 10;
		int d = 0;

		try {

			   b = a[9] / c;
			         try {

				          System.out.println(b / d);

			             } catch (ArithmeticException e) {

				         System.out.println("Arithmetic Exception Handled");
			              } 
			         finally {

				           System.out.println("Inner finally block");
			              }

		} 
		
		catch (ArrayIndexOutOfBoundsException  ae) {

			System.out.println("Array Index Out Of Bounds Exception Handled");
		} 
		finally {
			System.out.println("Outer Finally Block ");
		}

	}

}
