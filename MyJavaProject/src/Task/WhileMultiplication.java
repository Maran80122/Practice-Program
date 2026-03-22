package Task;

import java.util.Scanner;

public class WhileMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int a=1;
		while(a<=20)
		{
			System.out.println(num + "*" + a + "=" + num*a);
			a++;
		}
		

	}

}
