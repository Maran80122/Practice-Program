package Abstraction;
abstract class Environment{
	public abstract void Pollution();  //abstract method
	public void weather() //concrete method
	{
		System.out.println("poillution is based on the weather");
	}
//	
}
class Country extends Environment
{
	public void pollution()
	{
		System.out.println("country is safe when there is no plastics");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		
		Country c=new Country();
		c.pollution();
		c.weather();
		// TODO Auto-generated method stub

	}

}
