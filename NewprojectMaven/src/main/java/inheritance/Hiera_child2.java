package inheritance;

public class Hiera_child2 extends Hiera_parent {

	public void displaytest()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		Hiera_child2 obj1 = new Hiera_child2();
		obj1.displaytest();
		obj1.show();
		

	}

}
