package logical;

public class Findfirstduplicateno {

	public static void main(String[] args) {

		String a = "maharashtram";

		for (int i = 0; i < a.length(); i++) {
			boolean b = true;
			for (int j = 0; j < a.length(); j++) {

				if (i != j && a.charAt(i) == a.charAt(j)) {

					b = false;

				}

			}
			if (b) {
				System.out.println(a.charAt(i));
				break;
			}

		}

	}
}
