package array2D;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter size1");
		int size1=s.nextInt();
		System.out.println("enter a size2");
		int size2=s.nextInt();
		int[][] a=new int[size1][size2];
		
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				a[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println("");
		}
		int max=a[0][0];
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
		
		}
		System.out.println(max);
	}

}
