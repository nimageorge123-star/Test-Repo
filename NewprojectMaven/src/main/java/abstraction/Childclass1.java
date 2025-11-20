package abstraction;

public class Childclass1 extends Parentclass1{

	public static void main(String[] args) {
		
		Parentclass1 obj1= new Childclass1();
		obj1.display();
		obj1.view();
		Childclass1 obj2 =new Childclass1();
		obj2.childclassmethod();

	}
	
	public Childclass1()
	{
		
		super(12);
		System.out.println("child class constructor");
	}
	
	public void childclassmethod()
	{
		System.out.println("childclass method");
	}

	@Override
	public void display() {
		System.out.println("First abstarch method overriding");
		
	}

}
