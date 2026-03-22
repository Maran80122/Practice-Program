package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayAndAlsoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number");
		int a=s.nextInt();
		System.out.println("size"+ a);
		String[] arr=new String[a];
		System.out.println("size"+ a);

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
		System.out.println("reverse array"+Arrays.toString(rev));
		String revstring[]=new String[a];
		for(int i=0;i<arr.length;i++)
		{
		String word=rev[i];
		String Revword="";
		for(int j=word.length()-1;j>=0;j--)
		{    
			Revword+=word.charAt(j);
			
		}
			revstring[i]=Revword;
			
	}
		System.out.println("reverse String"+Arrays.toString(revstring));
}
}
