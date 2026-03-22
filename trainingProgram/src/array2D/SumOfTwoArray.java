package array2D;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size1");
		int size1=s.nextInt();
		System.out.println("enter a size2");
		int size2=s.nextInt();
		int[][] a=new int[size1][size2];
		int[][] b=new int[size1][size2];
		
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("array1");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				
				System.out.print(a[i][j]);
				
			}
			System.out.println("");
		}
			
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.println("["+i+"]["+j+"]");
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("array2");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.print(b[i][j]);
				
			}
			System.out.println();
		}
		int[][] arr3=new int[size1][size2];
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				arr3[i][j]=a[i][j]+b[i][j];
				
			}
		
		}
		System.out.println("array3");
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				System.out.print(arr3[i][j]);
				
			}
		System.out.println();
		}
	}

}
