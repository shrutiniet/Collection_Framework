package Collections_Java;
import java.util.*;
public class Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<>();  //bcoz we are impleenting queue using linkedlist
		queue.offer(0);
		queue.offer(12);    //to add elements in queue
		queue.offer(15);
		queue.offer(112);
		queue.offer(115);
		System.out.println(queue);
		queue.poll();     // to get element out
		System.out.println(queue);
		System.out.println(queue.peek());     // to get element at 1 position
		
	}

}
