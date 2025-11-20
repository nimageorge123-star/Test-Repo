package polymorphism;
//overriding

public class Childclass extends Parentclass {
	
	public void display(int a, int b)
	{
		super.display(2, 3);
		int sum= a-b;
		System.out.println(sum);
	}

	public int multiply(int a, int b)
	
	{
		System.out.println(super.multiply(2, 3));
		int mult= a*b;
		return mult;
	}

	
	
	@Override
	public void view(float a, float b) {
		// TODO Auto-generated method stub
		super.view(10f, 20f);
		
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		Childclass obj= new Childclass();
		obj.display(1,2);
		System.out.println(obj.multiply(5, 2));
		obj.view(40, 20);
		

	}

}
