package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> obj1= new ArrayList<String>();
		
		System.out.println(obj1);
		
		
		//ADD Method--To insert a new element in the collection
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Red");
		obj1.add("Red");
		obj1.add("orange");
		System.out.println(obj1);
		
		//index()-- to return the index of the object
		
		System.out.println(obj1.indexOf("White"));
		System.out.println(obj1.indexOf("Red"));
		
		//LastIndexOf()-->> To return the last occurence
		System.out.println(obj1.lastIndexOf("Red"));
		System.out.println(obj1.lastIndexOf("Violet"));
		
		
		//contains()--To check whether an element is present or not--Returns true or false
		
		System.out.println(obj1.contains("Blue"));
		System.out.println(obj1.contains("Violet"));
		
		//get-->> to get an element based on the index
		
		System.out.println(obj1.get(1));
		
		//Remove-->>to remove an particular element based on the index
		
		System.out.println(obj1.remove(1));
		System.out.println(obj1);
		
		//Isempty()-->> to check the list is empty
		
		System.out.println(obj1.isEmpty());
		
		for(int i=0; i<4;i++)
		{
			System.out.println(obj1.get(i));
		}
		
		for(String ab:obj1)
		{
			System.out.println(ab);
		}
		
		
		

	}

}
