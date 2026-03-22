package Pattern;

import java.util.Scanner;

public class Pyramid12345 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
//		for(int i=n;i>=1;i--)
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
//				System.out.print("* ");
				System.out.print(k);
//				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	
		
	}
}
