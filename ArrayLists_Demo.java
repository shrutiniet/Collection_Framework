package Collections_Java;
import java.util.*;
public class ArrayLists_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> str=new ArrayList<String>();  //by default size is 10
		str.add("S_112");
		str.add("S_115");
		str.add("Mr.Roysaa");
		str.add("Shiv");
		str.add("Shuru");		
		System.out.println(str);
		str.add(2,"SKR");  //to add at particular position
		str.add(3,"SS");	//to add at particular position
		str.add("arrays");
		System.out.println(str);
		
		List<String> newstr=new ArrayList<>();   //to add a list in new list
		newstr.add("1215");
		newstr.add("1512");
		newstr.addAll(str);
		System.out.println(newstr);
		
		System.out.println(str.get(4));    //to get element from a particular position
		str.remove(7);   // to remove particular indexed value
		str.add("array");
		System.out.println(str);
		str.remove(String.valueOf("array"));  //to remove element by value
		System.out.println(str);
		
		newstr.clear();  // to clear cmlt list
		
		str.set(0,"SKR_112");    //to update value at particular index
		System.out.println(str);
		str.set(0,"S_112");
		System.out.println(str);
		
		System.out.println(str.contains("Shiv"));   //return true if value is present otherwise returns false
		System.out.println(str.size());   //to get size of list
		
		
		
		//To iterate all elements present in list
		//1. using for loop
		for(int i=0;i<str.size();i++)
		{
			System.out.println("Element at :"+i+"th position is :"+ str.get(i));
		}
		
		
		//2. using for-each loop
		for(String val: str)
		{
			System.out.println("The element is :"+val);
		}
		
		//3. Iterator
		Iterator<String> it=str.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator value:"+it.next());
		}
	}
}
