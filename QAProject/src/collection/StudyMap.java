package collection;

import java.util.HashMap;
import java.util.Map;

public class StudyMap {



	public static void main(String[] args) {

		Map<Integer, String> num = new HashMap<>();

		num.put(1, "Kalpesh");
		num.put(3, "Vaibhav");
		num.put(2, "ravi");
		num.put(4, "Sandip");

		num.put(1, "Kunal");

		System.out.println(num);

		System.out.println();
		for (Map.Entry<Integer, String> f : num.entrySet()) {

			System.out.print(f + " ,");
		}
		System.out.println();

		System.out.print(num.get(3));
		System.out.println();
		System.out.print(num.get(1));
		System.out.println();
		for (Integer key : num.keySet()) {

			System.out.print(key + " , ");
		}
		System.out.println();
		for (String value : num.values()) {

			System.out.print(value + " , ");
		}
		System.out.println();
		System.out.println(num.isEmpty());

	}

}
