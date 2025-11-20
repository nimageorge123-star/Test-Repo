package superkeyword;

public class superchildmethod extends superparentmethod {
	
	public void display() {
		System.out.println("child");
		super.show();
		super.test(1, 2);
		this.childdisplay();
		}
	
	public void childdisplay()
	{
		System.out.println("childdisplay");
	}

	public static void main(String[] args) {
		
		superchildmethod obj1 = new superchildmethod();
		obj1.display();
		//obj1.show();

	}

}
