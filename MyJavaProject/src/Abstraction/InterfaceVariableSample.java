package Abstraction;
interface In1{
	final int a=10;
	static void display()
	{
		
		System.out.println("I am a static method");
	}
}

public class InterfaceVariableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		In1.display();
		System.out.println(In1.a);


	}

}
