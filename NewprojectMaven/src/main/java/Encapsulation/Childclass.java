package Encapsulation;

public class Childclass {

	public static void main(String[] args) {
		
		Parentclass obj1 =new Parentclass();
		obj1.setAge(12);
		System.out.println(obj1.getAge());
		obj1.setName("riya");
		System.out.println(obj1.getName());
		
	}

}
