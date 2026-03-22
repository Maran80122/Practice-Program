package Task;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The enter value is:");
		int num =sc.nextInt();
		
		System.out.println("num :"+num);
		
		if(num%2==0)
		{
			System.out.println("this is even number");
			
		}
		else
		{
			System.out.println("this is odd number");
		}
		
		
		

	}

}
