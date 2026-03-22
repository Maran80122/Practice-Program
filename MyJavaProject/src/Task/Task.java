package Task;


import java.util.Scanner;
public class Task {

	public static void main(String[] args)
	{
		Scanner val=new Scanner(System.in);
		
		System.out.println("The enter value of a:");
		int a =val.nextInt();

		System.out.println("The enter value of b:");
		int b =val.nextInt();
		
//		ADD
		int sum= a+b;
		System.out.println("Add a two number is:"+sum);

		
//		Sub
		int sub=a-b;
		System.out.println("sub a two number is:"+sub);
		
//		multplication
		
		System.out.println("enter the value of c:");
		int c=val.nextInt();
		System.out.println("enter the value of d:");
		int d=val.nextInt();		
		int mul=c*d;
		System.out.println("multiply a two values is:"+mul);
		
		
//		division
		
		int div=c/d;
		System.out.println("division of two numbers is"+div);
		
//		modulus
		
		int mod=c%d;
		System.out.println("the modulus of two numbers is:"+mod);
	}

}
