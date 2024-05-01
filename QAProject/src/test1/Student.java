package test1;

public class Student {
	
	
	 Student(){
		System.out.println("Student read books");
		
	    }
	
     Student(String notebook){
    	
    	System.out.println("Student read notebook"+notebook);
    	
	}
     
   public  void Department(String paper,int newspaperno){
    	
    	
    	
    	System.out.println("Student read paper"+paper);
    	System.out.println("Student read newspaper"+newspaperno);
    }
   
   public void Department(int bookPrice){
    	System.out.println("Student buys book for ="+bookPrice);
    	
    }
      
     
}
