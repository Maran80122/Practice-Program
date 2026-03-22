package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void 	LeftRotate(int[] arr,int k)
	{
		k=k%arr.length;
		for(int j=0;j<k;j++)
		{
			int first=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
				
			}
				arr[arr.length-1]=first;
		}
	}
	public static void 	RightRotate(int[] arr,int k)
	{
		k=k%arr.length;
		for(int j=0;j<k;j++)
		{
			int last=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[0]=last;
		}
	}
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
		
		System.out.println("enter a rotation:");
		int k=s.nextInt();
		
		LeftRotate(arr,k);
		System.out.println("leftRotation is "+k+":"+Arrays.toString(arr));
		
		RightRotate(arr,k);
		System.out.println("rightRotation is "+k+":"+Arrays.toString(arr));
		

	}

}
