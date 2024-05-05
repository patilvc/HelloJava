package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionInshort {

	public static void main(String[] args) {

     int [] a= {2,4,5,7,3,8,10,9,1,11,15,13,12,12,1,2};
     
     
     
  //   System.out.println("arraylist");
     
//     ArrayList al= new ArrayList<>();
//		
//      for (int i=0;i<a.length;i++) {
//    	  
//    	al.add(a[i]);
//    	
//      }
//      System.out.println(al);
//      System.out.println();
//   
//      for (Object b: al) {
//    	  
//    	  System.out.print(b+ " , ");
//      }
      
//      TreeSet ts= new TreeSet();
//      
//      for (int i=0;i<a.length;i++) {
//    	  
//    	  
//    	  ts.add(a[i]);
//      }
//     
//      System.out.println(ts);
//     
//	}
	
	HashSet Hs= new HashSet();
	
	
	 for (int i=0;i<a.length;i++) {
   	  
   	  
   	  Hs.add(a[i]);
     }
	 
	 System.out.println(Hs);

	}
}
