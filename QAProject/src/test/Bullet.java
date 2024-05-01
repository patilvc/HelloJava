package test;

public class Bullet  implements Vehical1{
	
	int amount=45000;
	public void sound() {		
		System.out.println("Bullet sound is very big");
	}
	public void Speed() {		
	 System.out.println("Bullet having speed of 150Km/hr");
	}	
	public static void main(String[] args) {		
		Vehical1  ob =new Bullet();//up casting		
		ob.sound();
		ob.Speed();
		int a=ob.amount;
        int b=ob.amount;
	System.out.println(a);
	System.out.println(b);
	}
}
