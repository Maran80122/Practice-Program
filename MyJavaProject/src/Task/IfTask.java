package Task;

import java.util.Scanner;
public class IfTask {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your age is:");
		int age =a.nextInt();
		System.out.println("Enter your Nationality is :");
		String name=a.next();
		if((age>18) && (name.equals("Indian")))
		{
			System.out.println("Eligibility to vote");
		}
		else
		{
			System.out.println("not Eligibility to vote");
		}
	

	}

}
