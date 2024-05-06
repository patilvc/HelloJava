package exception;

public class Studythrow {

	int a = 12;
	int b = 5;

	public static void main(String[] args) {

		Studythrow ob = new Studythrow();
		try {
			ob.divide();
		} catch (Exception ee) {

			System.out.println("Can not divide by 5");
		}
		
	}

	public void divide() {

		if (b == 5) {

			throw new ArithmeticException("Can not divide by 5");
		} else {

			int result = a / b;
			System.out.println(result);
		}

	}

}
