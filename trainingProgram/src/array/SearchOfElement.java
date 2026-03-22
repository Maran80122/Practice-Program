package array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchOfElement {

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
		
		System.out.println("enter a scanvalue");
		int sc=s.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==sc)
			{
				System.out.println("number of the position:"+(i+1));
				found=true;
				break;
			}
		}
		if(!found)
			
		{
			System.out.println("don't match a value");
		}
		
		

	}

}
