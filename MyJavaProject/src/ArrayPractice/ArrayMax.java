package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your size");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		
		}
		System.out.println(Arrays.toString(a));
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max=a[i];
			}
		}
				System.out.println("max number"+max);
	}

}
