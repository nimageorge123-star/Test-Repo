package abstraction;

public abstract class Parentclass1 {
	
	public abstract void display();
	
	public void view()
	{
		System.out.println("Non abstarct method");
		
		
	}
	
	public  Parentclass1()
	{
		System.out.println("this is parent constructor");
		
		
	}
	
	public Parentclass1(int age)
	{
		System.out.println(age);
	}

}
