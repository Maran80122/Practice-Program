package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int a=s.nextInt();
		String[] arr=new String[a];
		System.out.println("size"+a);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.next();
			
		
		}
		
		System.out.println("Arrays"+Arrays.toString(arr));
		String rev[]=new String[a];
		for(int i=0;i<arr.length;i++)
		{
			rev[i]=arr[a-1-i];
		}
		System.out.println(Arrays.toString(rev));
		}

}
