package array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallest {

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
		System.out.println("sum of a array"+Arrays.toString(arr));
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("largest"+max);
		System.out.println("smallest"+min);

	}

}
