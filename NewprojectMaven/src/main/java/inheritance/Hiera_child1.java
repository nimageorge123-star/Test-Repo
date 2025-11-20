package inheritance;

public class Hiera_child1 extends Hiera_parent
{

	public void display()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		
		Hiera_child1 obj1 = new Hiera_child1();
		obj1.display();
		obj1.show();

	}

}
