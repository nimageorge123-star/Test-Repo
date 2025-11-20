package abstraction;

public class Childclass extends Parentclass{

	public static void main(String[] args) {
		
		Childclass obj1= new Childclass();
		obj1.display();
		System.out.println(obj1.show());
		obj1.test();
		

	}

	@Override
	public void display() {
		System.out.println("abstract method overriding");
		
	}

	@Override
	public int show() {
		int a=1;
		int b=2;
		int c=a+b;
		return c;
	}

}
