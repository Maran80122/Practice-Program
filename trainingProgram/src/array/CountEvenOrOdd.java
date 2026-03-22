package array;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOrOdd {

//	private static int evencount;

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
		int evencount = 0;
		int oddcount=0;
		for(int num:arr)
		{
			if(num %2==0)
			{
				evencount++;
			}
			
			else
			{
				oddcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
