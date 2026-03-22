package methods;

import java.util.Scanner;

//Write a method to calculate the square of a number.
//Example: Input → 6 → Output → 36
public class SquareNumber {
	public static int square(int a)
	{
//		return a*a;
		return (int)Math.pow(a,2);   // in built
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
	
		int result=square(a);
		System.out.println("square is"+result);
		
		

	}

}
