package ArrayPractice;


import java.util.Scanner;



public class Array2dUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("size");
		int size=s.nextInt();
	
		
		int[][] a=new int [size][size];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print("element["+ i +"]["+ j +"]:");
				a[i][j]=s.nextInt();
				
			}
//			System.out.println("2d array is"+Arrays.toString(a));
			
		}
		System.out.println("2d array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println();
		
		

	}

}
