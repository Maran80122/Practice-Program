package MultiDimensionalArray;

import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] arr=new int[2][2];
		
		System.out.println("enter 4 Integer for 2X2 array");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("enter element at position ["+i+"]["+j+"]:");
				arr[i][j]=s.nextInt();
				
			}
		}
		System.out.println("the 2X2 array is");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
