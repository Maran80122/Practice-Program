package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value size1");
		int a=s.nextInt();
		int[] arr1=new int[a];
		for(int i=0;i<a;i++)
		{
			arr1[i]=s.nextInt();
			
		}
		System.out.println("array1");
		System.out.println("array1:"+Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
			
				}
				System.out.println("arrays sorted is:"+Arrays.toString(arr1));
			}
		}
		
		System.out.println("arrays sorted is:"+Arrays.toString(arr1));
	}

}
