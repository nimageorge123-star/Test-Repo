package Methodoverloading;

public class overload {
	
	
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
		
	}
	public void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) 
	
	{
		
		overload obj1 = new overload();
		obj1.add(1, 2);
		obj1.add(1, 2, 3);
		
				
	}

}
