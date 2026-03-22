package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

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
				int sum=0;
				int avg=0;
				for(int i=0;i<arr.length;i++)
				{
					sum+=arr[i];
				
				}
				avg=sum/arr.length;
				System.out.println(sum);
				System.out.println(avg);
	}

}
