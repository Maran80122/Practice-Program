package Task;

import java.util.Scanner;

public class SwitchCaseTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a screen");
		int screen=sc.nextInt();
		System.out.println("Enter a Time " );
		String time=sc.next();
		switch(screen)
		{
		case 1:
			switch(time)
			{
			case "7-10":
				System.out.println("hit 3");
				break;
			case "10-2":
				System.out.println("thug life");
				break;
			case "2-6":
				System.out.println("Fast & Furious");
				break;
			case "6-10":
				System.out.println("Mersal");
				break;
			default:
				System.out.println("unavailable time");
				
			}
			break;
		case 2:
			switch(time)
			{
			case "7-10":
				System.out.println("conjuring");
				break;
			case "10-1":
				System.out.println("captain america");
				break;
			case "2-6":
				System.out.println("iron man");
				break;
			case "6-10":
				System.out.println("Doctor Strange");
				break;
			default:
				System.out.println("unavailable time");
			}
			break;
		case 3:
			switch(time)
			{
			case "7-10":
				System.out.println("Manjumal boys");
				break;
			case "10-1":
				System.out.println("lucifer");
				break;
			case "2-6":
				System.out.println("thudarum");
				break;
			case "6-10":
				System.out.println("identity");
				break;
			default:
				System.out.println("unavailable time");
			}
			break;
		case 4:
			switch(time)
			{
			case "7-10":
				System.out.println("Good bad ugly");
				break;
			case "10-1":
				System.out.println("Master");
				break;
			case "2-6":
				System.out.println("Theri");
				break;
			case "6-10":
				System.out.println("Vikram");
				break;
			default:
				System.out.println("unavailable time");
			}
			
		default:
			System.out.println("screen is not available");
		}

	}

}
