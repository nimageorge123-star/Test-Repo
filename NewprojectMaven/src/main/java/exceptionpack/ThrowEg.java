package exceptionpack;

public class ThrowEg {

	public static void main(String[] args) throws Exception {
		 int age= 17;
				 
				 if(age>18)
				 {
			 System.out.println("eligible for voting");
				 }
				 
				 else
				 {
					 throw new Exception(" below 18");
				 }

	}

}
