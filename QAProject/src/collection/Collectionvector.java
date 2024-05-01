package collection;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Collectionvector {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("Pune");
		v.add(12.3f);
		v.add("Java");
		v.add("Bus");
		v.add(12345);
		v.add('a');
		v.add("Goa");
		v.add("Pune");
		v.add(20.3f);
		v.add("Java");
		v.add("Java");
		System.out.println(v);
		// v.clear();
//	    System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf("Goa"));
		System.out.println(v.lastIndexOf("Java"));
		System.out.println(v.set(6, "Kerala"));
		System.out.println(v);
		System.out.println(v.remove(6));

		for (Object vector : v) {

			System.out.print(vector + " ");
		}
		System.out.println();
		for (int i = 0; i < v.size(); i++) {

			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		Iterator vc = v.iterator();

		while (vc.hasNext()) {

			System.out.print(vc.next() + " ");
		}
		System.out.println();
		ListIterator Li = v.listIterator();

		while (Li.hasNext()) {

			System.out.print(Li.next() + " ");
		}

	}

}
