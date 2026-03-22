package methods;

public class Fibonnaci {
	public static void  fib(int n)
	{
		int b=0;int c=1;
		if(n>=1)
			System.out.println(b+" ");
		if(n>=2)
		{
			
			System.out.println(c+" ");
		}
		for(int i=3;i<=n;i++)
		{
			int d=b+c;
			System.out.println(d+" ");
			b=c;
			c=d;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fib(n);
		

	}

}
