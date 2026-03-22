package user;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner myobj=new Scanner(System.in);
		
		System.out.println("enter your name");
		
		String name = myobj.nextLine();
		System.out.println("the string value is:"+name);
		
		
		System.out.println("enter the number a");
		int a=myobj.nextInt();
		System.out.println("the value of a is:"+a);
		

		System.out.println("enter the decimal number b");
		float b=myobj.nextFloat();
		System.out.println("the value of a is:"+b);
		
		System.out.println("enter the double number b");
		double d=myobj.nextDouble();
		System.out.println("the value of a is:"+d);
		
			myobj.close();

	}

}
