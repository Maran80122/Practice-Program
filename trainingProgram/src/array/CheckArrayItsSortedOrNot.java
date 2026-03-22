package array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayItsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int a=s.nextInt();
		int[] arr=new int[a];
		System.out.println("size"+a);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Arrays"+Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("sorted array"+Arrays.toString(arr));
		
		boolean sorted=true;
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
			
				sorted=false;
				break;
			}
		}
		if(sorted)
		{
			System.out.println("it is  sorted");
		}
		else {
			System.out.println("it is not sorted");
		}
		
		

	}

}
