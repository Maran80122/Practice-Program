package array;

import java.util.Arrays;
import java.util.Scanner;

//<*********************find the three digit number***********************>

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int size=s.nextInt();
		System.out.println("size is:"+size);
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("array is"+ Arrays.toString(arr));
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=100 && arr[i]<=999)
			{ 
				int value=arr[i];
				System.out.println("three digit number is"+ value);
					found=true;
			}
		}
			if(!found)
			{
			
					System.out.println("this array not a three digit value");
				
			}
			
		
	}

}
