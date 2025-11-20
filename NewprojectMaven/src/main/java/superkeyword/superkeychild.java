package superkeyword;

public class superkeychild extends superkey {
	
	String colour ="White";
	
	public void display()
	{
		System.out.println(super.colour);
		System.out.println(colour);
	}

	public static void main(String[] args) {
		
		superkeychild obj = new superkeychild();
		System.out.println((obj.colour));
		obj.display();
		System.out.println((obj.colours));
		
	}

}
