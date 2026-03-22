package StaticMethod;

public class StaticMethod1 {
	
	static int a=40;//static variable
	 
	int b=50; //instance variable
	 
	void simpleDisplay()
	{
		System.out.println(a); //static varibale is accessed in a nonstatic
		System.out.println(b);  // instance variable is also performed in nonstatic
		
		// nonstatic method is used to object
		
	}
	
	// declaration of static method
	static void staticDisplay()
	{
		System.out.println(a); // it is static varibale declared
		// System.out.println(b); it is a instance variable is not performed
	}
	
	//  static method is used not a object it is onnly help of method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod1 obj=new StaticMethod1();
		
		staticDisplay(); // calling a static method
		

	}

}
