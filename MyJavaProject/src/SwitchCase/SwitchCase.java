package SwitchCase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		switch(a)
		{
		case 10:
			System.out.println("The value of a is 10");
			break;
		case 20:
			System.out.println("The value of a is 20");
			break;
		case 30:
			System.out.println("The value of a is 30");
			break;
		case 40:
			System.out.println("The value of a is 40");
			break;
		case 50:
			System.out.println("The value of a is 50");
			break;
		default:
			System.out.println("the value is not 10,20,30,40");
		}

	}

}
