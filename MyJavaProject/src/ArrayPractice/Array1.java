package ArrayPractice;

import java.util.Scanner;
import java.util.Arrays;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int  i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("input 5 number"+Arrays.toString(arr));

	}

}
