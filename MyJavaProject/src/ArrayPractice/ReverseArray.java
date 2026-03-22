package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a size:");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("size is:"+size);
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("original Array"+Arrays.toString(a));
		
		System.out.println("revrse array");
		int[] rev=new int[size];
		for(int i=0;i<size;i++)
		{	
			
			rev[i]=a[size-1-i];
		}
		System.out.println("reverse array"+Arrays.toString(rev));
		

	}

}
