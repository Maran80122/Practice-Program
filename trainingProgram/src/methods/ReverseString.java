package methods;

import java.util.Scanner;

//Write a method to reverse a string.
//Example: Input → "java" → Output → "avaj"

public class ReverseString {
	public static String revString(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String a=s.next();
		System.out.println("reverse:"+revString(a));
		
		
	}

}
