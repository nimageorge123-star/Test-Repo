package collectionExample;

import java.util.HashSet;
import java.util.Set;

public class Setoperations {

	public static void main(String[] args) {
		
		
		Set<String> obj1 = new HashSet<String>();
		
		//ADD Method--To insert a new element in the set
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Red");
		obj1.add("Red");
		obj1.add("orange");
		obj1.add(null);
		obj1.add(null);
		obj1.add("violet");
		System.out.println(obj1);
		
		
		//addall()
		//size
		//remove
		
		
		obj1.remove("Blue");
		System.out.println(obj1);
		//IsEmpty
		//Contains
		//Containsall()
		//clear()---to clear the elements
		
		obj1.clear();
		System.out.println(obj1);
		
	}

}
