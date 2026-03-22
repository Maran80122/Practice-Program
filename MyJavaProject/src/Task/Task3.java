package Task;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			System.out.println("Enter your number");
			int a=in.nextInt();
			System.out.println("value of a is:"+a);
			if(a>0)
			{
				System.out.println("positive");
			}
			else
			{
				System.out.println("negative");
			}
	}

}
