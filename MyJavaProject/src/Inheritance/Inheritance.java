package Inheritance;

class Calculation{
	int z;
	public void addition(int x,int y)
	{
		z=x+y;
		System.out.println("The sum is"+z);
	}
	public void substraction(int x,int y)
	{
		z=x-y;
		System.out.println("The difference is"+z);
	}
	
}


public class Inheritance extends Calculation {
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("The multiplication is"+z);
	}

	public static void main(String[] args) {
		int a=20,b=23;
		Inheritance i=new Inheritance();
		i.addition(a,b);
		i.substraction(a,b);
		i.multiplication(a, b);
		
	}

}
