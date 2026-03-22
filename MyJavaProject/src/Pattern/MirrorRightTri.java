package Pattern;

import java.util.Scanner;

public class MirrorRightTri {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner n=new Scanner(System.in);
			System.out.println("enter your number");
			int s=n.nextInt();
			for(int i=1;i<=s;i++)
//				for(int i=s;i>=1;i--)
			{
				for(int k=1;k<=s-i;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
//					System.out.print("*");
					System.out.print(j);
//					System.out.print(i);
					
				}
				System.out.println();
		}

}

}
