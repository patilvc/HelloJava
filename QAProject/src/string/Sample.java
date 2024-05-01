package string;

public class Sample {

	public static void main(String[] args) {
	
		 String a1="Vaibhav";
		 String a2="Vaibhav";
		 String a3=new String ("Vaibhav");
		 String a4=new String ("Vaibhav");
		 String a5="vaibhav";
		 
		 System.out.println(a1==a2);//True
		 System.out.println(a1==a3);//false
		 System.out.println(a3==a4);//false
		 
		 System.out.println(a1.equals(a2));//True
		 System.out.println(a1.equals(a3));//True 
		 System.out.println(a3.equals(a4));//True
		 System.out.println(a3.equals(a4));//True
		 System.out.println(a1.equals(a5));//False
		 System.out.println(a1.length());
		 System.out.println(a2.length());    
	}

}
