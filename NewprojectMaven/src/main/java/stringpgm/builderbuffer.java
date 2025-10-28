package stringpgm;

public class builderbuffer {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		StringBuilder sbs = new StringBuilder("hii");
		System.out.println(sbs);

		
		//insert()-->to insert a new value into the string based on the index position
		
		System.out.println(sb.insert(5, "world"));
		System.out.println(sb);
		
		//append()-->>to add a new string at last
		
		System.out.println(sb.append(sbs));
		System.out.println(sb.append("test"));
		
		//replace()--> to replace a one string into another one based on the index
		
		System.out.println(sb.replace(0, 05, "welcome"));
		
		//delete-->>to delete a string based on the index
		
		System.out.println(sb.delete(0, 7));
		
		//reverse()--> to reverse a string
		
		System.out.println(sbs.reverse());
		
		
		
	}

}
