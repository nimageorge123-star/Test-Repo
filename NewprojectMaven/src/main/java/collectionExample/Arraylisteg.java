package collectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisteg {

	public static void main(String[] args) {
		
		ArrayList<String> obj1= new ArrayList<String>();
		
		//ADD Method--To insert a new element in the collection
				obj1.add("Blue");
				obj1.add("White");
				obj1.add("Red");
				obj1.add("Red");
				obj1.add("orange");
				System.out.println(obj1);
				
				ArrayList<String> obj2= new ArrayList<String>();
				obj2.add("sky");
				obj2.add("sun");
				obj2.add("moon");
				System.out.println(obj2);
				
				//addall()-->>to add elements from one list to another list
				
				System.out.println(obj1.addAll(obj2));
				System.out.println(obj1);
				
				
				//containsall()-->>to check whether an one list is present on other list
				
				System.out.println(obj1.containsAll(obj2));
				System.out.println(obj2.containsAll(obj1));
				
				//size()--to check the length of the string
				
				System.out.println(obj1.size());
				
				
				//iterator
				
				Iterator<String> it = obj1.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
				it.remove();
				System.out.println(obj1);
				
				
	}

}
