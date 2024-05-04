package collection;


import java.util.Map;
import java.util.TreeMap;

public class StudyTreemap {

	public static void main(String[] args) {


		Map<Integer, String> num = new TreeMap<>();

		num.put(1, "Kalpesh");
		num.put(3, "vaibhav");
		num.put(2, "ravi");
		num.put(4, "sandip");
		num.put(5, "Kunal");

       
		System.out.println(num);
		for (Map.Entry<Integer, String> f : num.entrySet()) {

			System.out.print(f + " ,");
		}
		System.out.println();
		
	}

}
