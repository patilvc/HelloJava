package test1;

public class Android extends Mobile {

	public Android(int price) {

		super(price);

	}

	public void calculateprize() {

		System.out.println("android  mobile cost is = " + getPrice());
	}
}
