package collection;

import java.util.LinkedList;
import java.util.Queue;

public class StudyLinkedListQueue {

	public static void main(String[] args) {


		
		Queue<Integer> Q=new LinkedList<>();//First in first out
		
		Q.offer(12);
		Q.offer(24);
		Q.offer(36);
		Q.offer(52);
		
		
		System.out.println(Q);
		System.out.println(Q.poll());
		System.out.println(Q);
		System.out.println(Q.peek());
		System.out.println(Q.poll());
		System.out.println(Q);
		
		

	}

}
