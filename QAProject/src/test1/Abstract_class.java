package test1;

  abstract public class Abstract_class {
	
	private int Screengard_price=1000;
	private int camera_prize=2000;
	public void mobiles() {
		
		System.out.println("all types mobiles availble on this page ");
	}
    public void washingmachin() {
		
		System.out.println("all types washingmachin availble on this page ");
	}
	abstract public void oneplusmobile(); 
	abstract public void applemobile(); 
	
	public void addition() {		
	//	int AdditionalPrize=Screengard_price+camera_prize;		
		int central_GST=18;
		int state_GST=10;		
	//	System.out.println("AdditionalPrize= "+ AdditionalPrize);
		System.out.println("central_GST%= "+ central_GST);
		System.out.println("state_GST%= "+ state_GST);
		
	}
}
