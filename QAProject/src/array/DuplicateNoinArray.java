package array;

public class DuplicateNoinArray {

	public static void main(String[] args) {	
		int []a= {10,11,11,12,9,7,12,13,13,7,10};
		int count=0;
		
		for (int i=0;i<a.length;i++) {
			
			for (int j=i;j<a.length;j++) {
				
				if (i!=j &&a[i]==a[j] ) {
									
					System.out.println(a[i]);
					count++;
				}
				
			}
		}
		
		System.out.println("Total Duplicate no.= "+ count);

	}

}
