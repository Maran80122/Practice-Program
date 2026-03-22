package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter u size");
		int a=s.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++ )
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		sum+=arr[i];
		
		}
		System.out.println(sum);
	}

}
