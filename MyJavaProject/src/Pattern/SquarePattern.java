package Pattern;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner n=new Scanner(System.in);
			System.out.println("enter your number");
			int s=n.nextInt();
			for(int i=1;i<=s;i++)
			{
				for(int j=1;j<=s;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
