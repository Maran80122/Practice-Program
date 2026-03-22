package Pattern;

import java.util.Scanner;

public class ReverseRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("enter your number");
		int s=n.nextInt();
		for(int i=s;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*");
			}
			System.out.println();
	}
		
//		k pattern
		for(int i=2;i<=s;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*");
			}
			System.out.println();
	}
	}

}
