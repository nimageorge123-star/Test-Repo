package multipleinheritance;

public class ClassTest implements InterfaceA, InterfaceB {

	@Override
	public void sub() {
		
		System.out.println("sub method");
	}

	@Override
	public void sum() {
		
		System.out.println("sum method");
	}

	public static void main(String[] args) {
		
		ClassTest obj1=new ClassTest();
		obj1.sub();
		obj1.sum();
		obj1.mult();
		

	}

	@Override
	public void mult() {
		System.out.println("multiply");
		
	}

}
