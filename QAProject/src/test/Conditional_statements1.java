package test;

public class Conditional_statements1 {

	public static void main(String[] args) {
		
		int marks =60;
		int criteria=40;
		
		if (marks>100) {
			
			System.out.println("Invalid entry");
				}
		else if (marks>=75) {
			
			System.out.println("Distinction");
		}
		else if (marks>=60) {
			
			System.out.println("First class");
		}
		
         else if (marks>=criteria) {
			
			System.out.println("pass");
		}
         else {
        	 
        	 System.out.println("fail");
         }
		
		}
}
