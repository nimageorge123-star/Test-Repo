package exceptionpack;

public class CustomException {

	public static void main(String[] args) throws MYEXCEPTION {
		 int age= 17;
		 
		 if(age>18)
		 {
	 System.out.println("eligible for voting");
		 }
		 else {
			 throw new MYEXCEPTION("Not eligible");
		 }

	}

}
