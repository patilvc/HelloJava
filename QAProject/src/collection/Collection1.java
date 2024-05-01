package collection;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Collection1 {
	public static void main(String[] args) {		
		
		List ob= new ArrayList(); // Incremental capacity =N+N/2+1
		
		ob.add("Vaibhav");
		ob.add(9898989);
		ob.add(21.2f);
		ob.add(null);
		ob.add(null);
		ob.add("Pune");
		ob.add("Pune");
		
		for (Object b : ob) {                   //ForEachLoop

			System.out.print(b + " ");
		}
		System.out.println();	
		for (int i=0;i<ob.size();i++) {           //ForLoop
			
			System.out.print(ob.get(i)+" ");
		}
		System.out.println();
		
		Iterator vc=ob.iterator();	             //Iterator
		while(vc.hasNext()) {
			
			System.out.print(vc.next()+" ");
		}
		System.out.println();
		ListIterator Li = ob.listIterator();     //ListIterator

		while (Li.hasNext()) {

			System.out.print(Li.next() + " ");
		}
		
	//	System.out.println(ob);
//		System.out.println(ob.size());
//		
//		System.out.println(ob.isEmpty());
//		System.out.println(ob.indexOf(null));
//		System.out.println(ob.lastIndexOf(null));
//		System.out.println(ob.remove(1));
//		System.out.println(ob.remove(5));
//		System.out.println(ob.size());
//		System.out.println(ob);
//		System.out.println(ob.set(0, "Kalpesh"));
//		System.out.println(ob);
		
		
//		
		
	}
}
