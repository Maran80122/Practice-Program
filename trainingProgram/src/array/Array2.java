package array;

import java.util.Arrays;
import java.util.Scanner;

//<******************print a second smallest number in a array*************************>
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("size"+size);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("array"+Arrays.toString(a));
		
	//<***************************sorted method*********************************************>	
		Arrays.sort(a);
	System.out.println("Arrays sorted is"+Arrays.toString(a));
	if(size<2)
		{
			System.out.println("second smallest number not in a arrays beacause size is small");
		}
		else {
			System.out.println("second smallest is:"+a[1]);
			}	
//<*************************************manual sorted*********************************************************>
//		if(size<2)
//		{
//			System.out.println("second smallest number not in a arrays beacause size is small");
//			return;
//		}
//		
//		int smallest =Integer.MAX_VALUE;
//		int secondSmallest =Integer.MAX_VALUE;
//		 for(int i=0;i<a.length;i++)
//		 {
//			 if(a[i]< smallest)
//			 {
//				 secondSmallest=smallest;
//				 smallest=a[i];
//				 
//			 } else if(a[i]>smallest && a[i] <secondSmallest)
//			 {
//				 secondSmallest=a[i];
//			 }
//		 }
//		 if(secondSmallest == Integer.MAX_VALUE)
//		 {
//			 System.out.println("all the ellemnt same");
//		 }
//		 else
//		 {
//			 System.out.println("secondsmallest"+secondSmallest);
//		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
