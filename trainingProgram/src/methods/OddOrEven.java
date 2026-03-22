package methods;

import java.util.Scanner;
//Write a method to check if a number is even or odd.
//Example: Input → 7 → Output → Odd
public class OddOrEven {
	public static  int evenorodd(int s)
	{
		if(s%2==0)
		{
			System.out.println("even");
			return s;
		}
		else
		{
			System.out.println("odd");
			return s;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int num=s.nextInt();
		System.out.println(+evenorodd(num));
		

	}

}
