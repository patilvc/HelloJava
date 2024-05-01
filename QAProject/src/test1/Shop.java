package test1;

public class Shop extends Abstract_class{

	 public void oneplusmobile() {
		 
		 System.out.println("total cost is 44000/Rs");
	 }
	
	 public void applemobile() {		 
		 System.out.println("total cost is 73000/Rs");
	 }
	
	public static void main(String[] args) {
		
		Shop ob= new Shop();	
		ob.mobiles();
		ob.oneplusmobile();
		ob.addition();
		
		ob.mobiles();
		ob.applemobile();;
		ob.addition();	
	}
}
