package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudyHashset {

	public static void main(String[] args) {


		
		Set Hs=new HashSet();
		
		
		Hs.add("Ravi");
		Hs.add(25);
		Hs.add('A');
		Hs.add(91.5f);
		Hs.add(null);
		Hs.add(null);
		Hs.add('A');
		Hs.add(100.45);
		
		System.out.println(Hs);
//		System.out.println(Hs.size());
//		System.out.println(Hs.isEmpty());
//		System.out.println(Hs.remove(100.45));
//		System.out.println(Hs);
//		Hs.clear();
//		System.out.println(Hs);
//		System.out.println(Hs.isEmpty());
//		
		for(Object a:Hs) {
			
			System.out.print(a+" , ");
			
		}
		System.out.println();
		
		Iterator itr =Hs.iterator();
		
		while(itr.hasNext()){
			
			System.out.print(itr.next()+" , ");
			
		}
		
		
	}

	

}
