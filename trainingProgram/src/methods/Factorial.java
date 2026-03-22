package methods;

import java.util.Scanner;

public class Factorial {
				public static int factorial(int a)
				{
					int fact=1;
					  for(int i=1;i<=a;i++)
					  {
						  fact*=i;
					  }
					  return fact;
				}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int num=s.nextInt();
		int result=factorial(num);
				System.out.println("factorial:" +result);

	}

}
