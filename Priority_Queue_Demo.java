package Collections_Java;
import java.util.*;
public class Priority_Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		pq.offer(15);
		pq.offer(12);
		pq.offer(0);
		pq.offer(112);
		pq.offer(115);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		
		System.out.println("------------------------------------------");
		//to change priority we use comparator
		Queue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
		pq1.offer(15);
		pq1.offer(12);
		pq1.offer(0);
		pq1.offer(112);
		pq1.offer(115);
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.peek());
	}

}
