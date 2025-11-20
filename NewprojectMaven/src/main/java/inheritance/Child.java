package inheritance;

public class Child extends Singleparent {

	
	public void show()
	{
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();
		ch.display(); 
		Singleparent pa = new Singleparent();
		pa.display();
		//pa.show(); we cannot access child properties by creating parent object
		

	}

}
