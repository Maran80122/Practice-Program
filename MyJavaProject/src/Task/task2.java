package Task;

import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("STUDENT DETAILS");
		
		System.out.print("Enter your Student Name:");
		String s=sc.next();
		
		
		System.out.print("Enter your Student Registration No:");
		long l=sc.nextLong();
		
		
		System.out.print("subject1 Mark ");
		float f1=sc.nextFloat();
//		System.out.println("subject1 Mark"+f1);
		
		System.out.print("subject2 Mark ");
		float f2=sc.nextFloat();
//		System.out.println("subject2 Mark"+f2);

		System.out.print("subject3 Mark ");
		float f3=sc.nextFloat();
//		System.out.println("subject3 Mark"+f3);
		
		System.out.print("subject4 Mark ");
		float f4=sc.nextFloat();
//		System.out.println("subject4 Mark"+f4);
		
		System.out.print("subject5 Mark");
		float f5=sc.nextFloat();
//		System.out.println("subject5 Mark"+f5);
		
		float avg= ((f1+f2+f3+f4+f5) / 5) ;
		 
		System.out.println("Average mark is:"+avg);
		
		
		

	}

}
