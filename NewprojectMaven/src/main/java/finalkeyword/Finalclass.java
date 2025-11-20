package finalkeyword;

public class Finalclass {

	public final void display()
	{
		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		
		final int a=2;
		//a=3; error is displayes as because we cannot change the value of a, as it is declared as final
		
		
		Finalclass obj1= new Finalclass();
		obj1.display();
		
		

	}

}
