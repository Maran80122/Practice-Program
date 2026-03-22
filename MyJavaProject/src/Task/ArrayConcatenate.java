package Task;

import java.util.Scanner;

public class ArrayConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your first size");
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int arr:a)
	{
		System.out.print(arr+" ");
	}
	System.out.println("enter your second size");
	int size1=sc.nextInt();
	int[] b=new int[size1];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	for(int arr1:b)
	{
		System.out.print(arr1+" ");
	}
	System.out.println("results");
	int[] arr3=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
arr3[i]=a[i];
	}
	int index=0;
	for(int i=a.length;i<arr3.length;i++)
	{
if(index<b.length) {
	arr3[i]=b[index];
	index++;
}
	}
	
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}	

	
	
	
	
	

}
}