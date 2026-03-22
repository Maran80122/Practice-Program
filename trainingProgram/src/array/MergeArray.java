package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

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
		
		System.out.println("enter a value size2");
		int b=s.nextInt();
		int[] arr2=new int[b];
		for(int i=0;i<b;i++)
		{
			arr2[i]=s.nextInt();
		}
		System.out.println("array2 ");
		System.out.println("array2"+Arrays.toString(arr2));
		int[] merge=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			merge[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			merge[arr1.length+i]=arr2[i];
		}
		System.out.println("merge"+Arrays.toString(merge));
	}

}
