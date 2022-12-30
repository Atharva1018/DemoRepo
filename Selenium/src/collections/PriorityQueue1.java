package collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		PriorityQueue PQ = new PriorityQueue();
		
		PQ.add('r');
		PQ.add('a');
		PQ.add('m');
		
		System.out.println(PQ);
		
		PQ.offer('j');
		PQ.offer('m');
		PQ.offer('m');
		
		System.out.println(PQ);
		
	}

}
