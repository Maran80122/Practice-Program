package Array;

import java.util.Scanner;

public class Arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//ask user for array size
		System.out.println("enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size]; //passing a size to array
		
		//read array element
		System.out.println("enter"+size+"elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();  //based on size loop will n=be increment 
		}
	//search
		System.out.println("enter the element you want to search");
		int key=sc.nextInt();
		boolean founds=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("the element is found"+i);
				founds=true;
				
			}
		}
		if(!founds)
		{
			System.out.println("the element not found");
		}
		
		
	}

	
	
}
