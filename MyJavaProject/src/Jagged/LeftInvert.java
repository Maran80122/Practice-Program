
package Jagged;

public class LeftInvert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		char[][] stars=new char[row][];
		for(int i=0;i<row;i++)
		{
			stars[i]=new char[i+1];
		}
		for(int i=0;i<stars.length;i++)
		{
			for(int k=1;k<row-i;i++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<stars.length;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
