package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class StudyPriorityQueue {

	public static void main(String[] args) {


		Queue <Integer> Q=new PriorityQueue<>();
		
		Q.offer(36);
		Q.offer(24);
		Q.offer(12);
		Q.offer(52);
		
		
		System.out.println(Q);
		System.out.println(Q.peek());
		Q.poll();
		System.out.println(Q);
		Q.poll();
		System.out.println(Q);
		System.out.println(Q.peek());
	}

}
