package Task;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a<1)
		{
			System.out.println("Its is not prime number");
		}
		else if( a%2==0 || a%3==0 || a%5==0 ||  a%7==0 || a%11==0 || a%13==0 || a%17==0 ||a%19==0 || a%23==0 || a%29==0 )
		{
			System.out.println("Its is a prime number");
		}
		else
		{
			System.out.println("Its is a consonat");
		}

	}

}


//Scanner sc = new Scanner(System.in);
//System.out.print("Enter a number: ");
//int num = sc.nextInt();
//
//if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || 
//    num == 17 || num == 19 || num == 23 || num == 29) {
//    System.out.println(num + " is a prime number");
//}
//
//if (num == 1 || num == 4 || num == 6 || num == 8 || num == 9 || num == 10 ||
//    num == 12 || num == 14 || num == 15 || num == 16 || num == 18 || num == 20 ||
//    num == 21 || num == 22 || num == 24 || num == 25 || num == 26 || num == 27 ||
//    num == 28) {
//    System.out.println(num + " is not a prime number");
//}
//
//if (num <= 0 || num > 29) {
//    System.out.println("Number out of supported range for 'if only' prime check.");
//}
//
//sc.close();
//    }
//}

