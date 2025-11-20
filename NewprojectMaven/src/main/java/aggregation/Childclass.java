package aggregation;

public class Childclass {
	
	String subject;
	int id;
	Parentclass ref;
	
	public  Childclass(String subject, int id, Parentclass ref)
	{
		
		this.subject=subject;
		this.id=id;
		this.ref=ref;
	}

	
	public void print()
	{
		System.out.println(subject);
		System.out.println(id);
		System.out.println(ref.name);
		System.out.println(ref.age);
	}
	public static void main(String[] args)
	
	{
		Parentclass obj= new Parentclass("Riya", 13);
		Childclass obj1= new Childclass("EEE", 12, obj);
		obj1.print();
	}

}
