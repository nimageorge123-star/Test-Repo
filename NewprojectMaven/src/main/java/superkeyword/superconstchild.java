package superkeyword;

public class superconstchild extends superconst{
	
	public superconstchild()
	{
		//super();
		System.out.println("child");
	}
	
	public superconstchild(int b)
	{
		super(6, 4);
		System.out.println(b);
	}

	public static void main(String[] args) {
		superconstchild obj1 = new superconstchild();
		//superconst obj2 = new superconst();
		superconst obj2 = new superconst(5);
		superconstchild obj3 = new superconstchild(6);
		

	}

}
