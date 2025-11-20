package inheritance;

public class Multilevel_childclass extends Multilevel_intermediate{
	
	
	public void test()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		
		Multilevel_childclass obj1 = new Multilevel_childclass();
		obj1.test();
		obj1.display();
		obj1.show();
		
		
		

	}

}
