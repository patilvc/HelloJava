package test1;

public class Iphone extends Mobile {

	public Iphone(int price) {

		super(price);
	}

	public void calculateprize() {

		System.out.println("Iphone mobile cost is = " + getPrice());
	}

}
