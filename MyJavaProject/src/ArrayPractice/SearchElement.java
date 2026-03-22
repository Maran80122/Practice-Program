package ArrayPractice;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,2,7};
		Scanner s=new Scanner(System.in);
		System.out.println("enter a key");
		int key=s.nextInt();
		System.out.println("the key is:"+key);
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==key)
				{
					System.out.println("find a element"+key);
				}
				
				else
				{
					System.out.println("not found a element");
				
				}
		}

	}

}
