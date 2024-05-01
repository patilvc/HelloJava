package test1;

public class Shop1 extends Shop{

	public void samsungwashingmashin() {
		 
		 System.out.println("total cost of samsungwashingmashin is 18000/Rs");
	 }
	
	public void IFBwashingmachin() {
		 
		 System.out.println("total cost of IFBwashingmachin is 25000/Rs");
	 }	
	public static void main(String[] args) {
		
		
		Shop1 vc=new Shop1();
		
//		vc.washingmachin();
//		vc.samsungwashingmashin();
//		vc.addition();		
		vc.washingmachin();
		vc.IFBwashingmachin();
		vc.addition();
	}
}
