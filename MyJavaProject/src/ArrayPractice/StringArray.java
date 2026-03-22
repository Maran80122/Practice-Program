package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("enter your size");
		int size=n.nextInt();
		n.nextLine();
		String[] a=new String[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=n.nextLine();
			
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
