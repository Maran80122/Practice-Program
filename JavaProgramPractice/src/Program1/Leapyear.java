package Program1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year ");
        int a = s.nextInt();
        
        String leap=((a%4==0 && a%100!=0) || (a%400==0))? "Leap year":"Not leap year";
        System.out.println(leap);
	}
	

}

