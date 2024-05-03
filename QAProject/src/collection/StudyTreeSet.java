package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class StudyTreeSet {

	public static void main(String[] args) {

		TreeSet Hs = new TreeSet();

//		Hs.add("pune");
//		Hs.add("kolhapur");
//		Hs.add("mumbai");
//		Hs.add("sangali");
//		Hs.add("thane");

		Hs.add(20);
		Hs.add(70);
		Hs.add(14);
		Hs.add(44);
		Hs.add(55);
		Hs.add(55);
	//	Hs.add(null);
		System.out.println(Hs);
		System.out.println(Hs.size());

		for (Object b : Hs) {

			System.out.print(b + " , ");
		}
		System.out.println();
		Iterator itr = Hs.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " , ");

		}
	}

}
