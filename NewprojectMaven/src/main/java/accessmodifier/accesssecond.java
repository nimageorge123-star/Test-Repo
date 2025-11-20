package accessmodifier;

public class accesssecond extends access{

	public static void main(String[] args) {
		
		accesssecond obj2= new accesssecond();
		obj2.method1();
		obj2.method3();
		obj2.method4();
		//obj2.method2();--not able to access private method outside the class
	}

}
