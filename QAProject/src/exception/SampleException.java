package exception;

public class SampleException {

	public static void main(String[] args) {

		int a = 50;
		int b = 10;
		int c = 0;
		int d;
		int f;
		int[] g = { 1, 2, 3, 4, 5, 6, 7, 0, 8, 9 };

		try {

			d = g[11] / c;
			System.out.println(d);

		} 
		catch (ArithmeticException e) {

			System.out.println("Do not divide any no with Zero");

		} 
		catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println(" Array Index Out of Bound Exception");

		}
		catch (Exception ee) {

			System.out.println(" We handle any exception");
		}
		finally {
			
			System.out.println("Finally Block is present  ");
		}
				
		

	}

}
