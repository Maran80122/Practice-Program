package methods;

//Write a method to check if a given number is prime.
//Example: Input → 11 → Output → Prime

public class Prime {
	public static boolean prime(int a)
	{
		
		if(a<=1)
		{
			return false;
		}
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		prime(a);
		
		if(prime(a))
		{
			System.out.println("is prime"+a);
		}
		else
		{
			System.out.println("is not prime"+a);
		}
	
		
		
		

	}

}
