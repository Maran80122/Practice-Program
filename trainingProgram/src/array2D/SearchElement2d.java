package array2D;

import java.util.Scanner;



public class SearchElement2d {

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
	
			System.out.println("enter a value");
			int k=s.nextInt();
			boolean found=false;
			for(int i=0;i<size1;i++)
			{
				for(int j=0;j<size2;j++)
				{
				   if(a[i][j]==k)
				   {
					   System.out.println("match a value+["+i+"]["+j+"]:"+a[i][j]);
					   found=true;
					   break;
				}
				System.out.println("");
			}
				if(!found)
				{
					System.out.println("mismatch");
				}
		}
	}
}
