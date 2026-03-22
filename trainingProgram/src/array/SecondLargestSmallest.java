package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSmallest {

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
				
				int smallest=Integer.MAX_VALUE;
				int secondsmallest=Integer.MAX_VALUE;
				int largest=Integer.MIN_VALUE;
				int secondlargest=Integer.MIN_VALUE;
				
				for(int num:arr)
				{
					if(num<smallest)
					{
						secondsmallest=smallest;
						smallest=num;
					}
					else if(num< secondsmallest && num!=smallest )
					{
						secondsmallest=num;
					}
					
					if(num>largest)
					{
						secondlargest=largest;
						largest=num;
					}
					else if(num> secondlargest && num!=largest )
					{
						secondlargest=num;
					}
					
				}
				if(secondsmallest==Integer.MAX_VALUE || secondlargest==Integer.MIN_VALUE)
				{
					System.out.println("don't have second largest and smallest");
				}
				else
				{
					System.out.println("secondsmallest"+ secondsmallest);
					System.out.println("secondlargest"+ secondlargest);
				
			 
				}
			 
			


	}

}
