package operator;

import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the value of a:");
		System.out.println("enter the value of b:");
		int a =obj.nextInt();
		int b=obj.nextInt();
		
		int c = a + b ;
		int d= a*b;
		int e = a/b;
		int f=a%b;
		
		System.out.println("addition of two number is:"+c);
		System.out.println(+d);
		System.out.println(+e);
		System.out.println(+f);
	}

}
