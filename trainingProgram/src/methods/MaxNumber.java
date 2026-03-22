package methods;

//Write a method to find the maximum of two numbers.
//Example: Input → 8, 12 → Output → 12
public class MaxNumber {
	public static int max(int c,int s)
	{
		if(c>s) {
			return c;
		}
		else
		{
			return s;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int a=8;
	       int b=12;
	    		   int  result=max(8,12);
	       System.out.println("max"+result);
		

	}

}
