package test;

public class Switchstatements1 {
	
	
	public static void main (String[] args) {
		
		String option="FT";
		
		switch (option ) {
		
		case "BC":
			System.out.println("Balance Check");
			break;
		case "CW":
			System.out.println("Cash withdrawal");
			break;	
		case "PC":
			System.out.println("Pin change ");
			break;	
		
		case "MS":
			System.out.println("Mini Statements");
			break;
		
		case "FT":
			System.out.println("Fund Transfer");
			break;
			
			default:
				System.out.println("Invalid data");
		
	}
	}
}
		
		
	