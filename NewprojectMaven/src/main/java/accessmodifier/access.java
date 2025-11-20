package accessmodifier;

public class access {
	
	public void method1()
	{
		System.out.println("public method1");
	}
	
	private void method2()
	{
		System.out.println("private method2");
	}
    void method3()
  {
    	System.out.println("default method3");
    	
  }
    protected void method4()
	{
		System.out.println("protected method4");
	}
    
    
    
	public static void main(String[] args) 
	
	{
		
		access obj1= new access();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		

	}

}
