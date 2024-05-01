
package test1;

public class Sample {

	public static void main(String[] args) {
		String a = "Pune is big city";
		String d="";
		String[] ar = a.split("");

		for (int i = 0; i < 7; i++) {
			String b = ar[i];
			System.out.print(b);
		}
		for (int i = 11; i < 16; i++) {
			String c = ar[i];

			System.out.print(c);
		}
		System.out.println();
		System.out.println(a.replaceAll("big", d));
	}

}
