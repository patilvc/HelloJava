package test;

public class Conditional_statements4 {

	public static void main(String[] args) {
	
		
		int age =19;
		String gender ="Female";
		if (age>=18) {
			System.out.println("person is legal voter");
			
			if (gender=="Male")
			{
				System.out.println("His marriage is illegal");
				
			}
			else
			{
				
				System.out.println("His marriage is legal");
			}
			
			
		}
		
		else {
			
			System.out.println("Person is child ");
			System.out.println("Not permitted for marriage");
		}
	}

}
