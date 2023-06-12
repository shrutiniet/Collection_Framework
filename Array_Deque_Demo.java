package Collections_Java;
import java.util.*;
public class Array_Deque_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> array=new ArrayDeque<>();
		array.offer(12);
		array.offer(15);
		System.out.println(array);
		array.offerFirst(112);  //to add element at first position or from front
		System.out.println(array);
		array.offerLast(115);	//to add element at last or rear 
		System.out.println(array);
		System.out.println(array.peek());  //to get element at first
		System.out.println(array.peekFirst());    //to get element at first or from front
		System.out.println(array.peekLast());    // to get element from last or rear
		System.out.println(array.poll());	//to delete element from front
		System.out.println(array.pollFirst());    //to delete element from front
		System.out.println(array.pollLast());      //to delete element from last or rear		
	}
}
