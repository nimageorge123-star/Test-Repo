package exceptionpack;

public class Testclass {
	
public static void main(String[] args)
	
	{
	//arithmetic exception
	try {
	int a= 10, b=0, div;
	div=a/b;
	System.out.println(div);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Exception handled");
	}
	
	finally
	
	{
		System.out.println("important code");
	}
	System.out.println("outside finally");
	
	//Arrayindexoutofboundexception
	
	/*int a[]= {1,3,4};
	for(int i=0;i<=5;i++)
	{
		System.out.println(a[i]);
	}*/
	
	//nullpointerException
	
	//String a= null;
	//System.out.println(a.length());
	
	
	
	}

	}


