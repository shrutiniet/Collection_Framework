package Collections_Java;
import java.util.*;
public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack<Integer> str=new Stack<>();  //Stack follows LIFO
	str.push(112);  //to add elements
	str.push(115);
	str.push(1215);
	str.push(1512);
	System.out.println(str);
	System.out.println(str.peek());  //to get element at top
	str.push(0);
	System.out.println(str);
	str.pop();
	System.out.println(str);
	
	}

}
