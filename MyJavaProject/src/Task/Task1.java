package Task;

import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the radius of value is");
		double r =sc.nextDouble();
		
		double area = 3.14 * r * r;
		System.out.println("Area of circle is:"+area);
		
		double perimeter= 2* Math.PI *r;
		System.out.println("perimeter of circle is:"+perimeter);
		
		

	}

}
