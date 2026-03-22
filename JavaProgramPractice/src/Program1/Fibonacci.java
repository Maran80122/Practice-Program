package Program1;

import java.util.Scanner;

public class Fibonacci {
		static int fibonacci(int b)
		{
			if(b==0)
			return 0;
			else if(b==1)
			return 1;
		else
			return fibonacci(b-1)+ fibonacci(b-2);
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int second=1;
//		int first=0;
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(first+" ");
//			int next=first+second;
//			first=second;
//			second=next;
//			
//		}

		System.out.println("fibonacci series");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        for(int i=0;i<=a;i++)
        {
        System.out.println(fibonacci(i)+" ");
        }
		
	}

}
