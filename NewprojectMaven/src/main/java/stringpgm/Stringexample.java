package stringpgm;

public class Stringexample {

	public static void main(String[] args) {
		
		String s1="hello";
		System.out.println(s1);
		String s2 = new String(" hi");
		System.out.println(s2);
		
		//length()--To return the length of the string
		System.out.println(s2.length());
		
		//concat()-->adding two strings
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat("test"));
		System.out.println(s1);
		
		//charAt()--To return character of the string based on the index
		System.out.println(s1.charAt(2));
		
		//contains()-->to check whether a character or word present in the string.,it return true value or false
		String s3 = "Welcome to the world";
		System.out.println(s3.contains("to"));
		System.out.println(s3.contains("for"));
		
		String s4= "java";
		String s5= "java";
		String s6= "Java";
		String s7= "selenium";
		
		//equals()--> To compare two strings
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(s7));
		
		//equalsIgnoreCase()-->> comparing two strings but ignoring the case
		System.out.println(s4.equalsIgnoreCase(s6));
		
		//toUpperCase()()-->> to convert lowercase to uppercase
		System.out.println(s4.toUpperCase());
		
		//toLowerCase()-->>to convert uppercase to lowercase
		System.out.println(s4.toLowerCase());
		
		//isEmpty()-->to check whether the string is empty or not
		System.out.println(s4.isEmpty());
		String s8 ="";
		System.out.println(s8.isEmpty());
		
		//valueOf()-->>to convert any data type to string
		int a= 10;
		System.out.println(String.valueOf(a));
		
		
		//==-->it is used to compare object references,meaning it checks if two variables point to the same memory location.
		//On the other hand, the .equals() method is used to compare the values of objects.
		
		String S8= "Hello world";
		String S9= "Hello world";
		String s10 = new String("Hello world");
		System.out.println(S8.equals(S9));
		System.out.println(S8==S9);
		System.out.println(S8.equals(s10));
		System.out.println(S8==s10);
		
		
		
		
		
		
		
		
		
		
				

	}

}
