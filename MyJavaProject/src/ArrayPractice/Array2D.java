package ArrayPractice;

import java.util.Scanner;

//Write a Java program to create a 3x3 2D integer array and print all elements.


public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your size");
		int size=s.nextInt();

		
		int[][] a=new int[size][size];
		 
		System.out.println("enter a values in matrix");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println("enter element ["+ i +"]["+ j +"]:");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
			
		}

	}

}
