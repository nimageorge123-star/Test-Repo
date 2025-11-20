package interfacepack;

public interface Interfaceclass {
	
	
	
	public static final int a=4;
	int b=6;
	
	public abstract void display();
	default void sub()
	{
		//b=7; error is displayed, it is final..we cannot change it
		System.out.println("default method");
	}
	
	static void mul()
	{
		System.out.println("static methods");
	}

}
