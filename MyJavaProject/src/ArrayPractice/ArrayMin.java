package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		System.out.println("enter your size");
		int size=ss.nextInt();
		int a[]=new int[size];
		System.out.println("size is:"+size);
		for(int i=0;i<size;i++)
		{
			a[i]=ss.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
			min=a[i];
			}
		}
		System.out.println("min values"+min);
		

	}

}
