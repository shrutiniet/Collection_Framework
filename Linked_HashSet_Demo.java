package Collections_Java;
import java.util.*;
public class Linked_HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<>();   //maintain order of insertion
		set.add(12);
		set.add(15);
		set.add(112);
		set.add(1215);
		set.add(1512);
		set.add(0);
		System.out.println(set);
		set.remove(0);
		System.out.println(set);
		System.out.println(set.contains(112));    //return true if set contains element otherwise return false               
		System.out.println(set.isEmpty());   //return true is set is empty otherwise returns false
		System.out.println(set.size());
		//set.clear();---> to empty set
		
	}

}
