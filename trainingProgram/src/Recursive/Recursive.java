package Recursive;

import java.util.Scanner;

public class Recursive {
	public static int fact(int n)
	{
		if(n==0||n==1)
	{
			return 1;
		}
	return n*fact(n-1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int number=6;
		int result=fact(number);
	System.out.println("factorial:"+" "+result);
	
	
	}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("entr a value");
	    int n=s.nextInt();
	    int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
	
		}
		
	}

	
