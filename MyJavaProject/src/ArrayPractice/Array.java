package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("size is:");
		int size=s.nextInt();
		int[] a=new int [size];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	

}
