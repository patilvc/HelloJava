package test;

public class Star {

	public static void main(String[] args) {
		
		for (int row=1;row<=8;row++) {
			
			for (int column =8;column>=row;column--) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
