package Program1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int a = s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
			System.out.println(fact);
	}

}
