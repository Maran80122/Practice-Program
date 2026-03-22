package array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteParticularNo {

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
	 
		System.out.println("enter a particular value:");
		int  p=s.nextInt();
		
		int j=0;
		int b[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=p)
			{
				b[j++]=arr[i];
			
			}
			
		}
		 int result[]=Arrays.copyOf(b, j);
		 System.out.println("delete value:"+Arrays.toString(result));
		 
	
		{
			 
		}
	}

}
