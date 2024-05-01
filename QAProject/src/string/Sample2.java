package string;

public class Sample2 {

	public static void main(String[] args) {

		String a = "Pune is Big city";
		System.out.println(a.length());

		String[] ar = a.split("");

//		for (int i = 0; i < 7; i++) {
//			// System.out.print(ar[i]);
//		}
//		for (int i = 11; i < 16; i++) {
//			// System.out.print(ar[i]);
//		}
//		System.out.println(a.substring(7));
//		System.out.println(a.substring(7, 16));

		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}

}
