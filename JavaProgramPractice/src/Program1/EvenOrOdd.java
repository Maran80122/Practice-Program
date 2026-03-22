package Program1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int evenCount=0;
		int OddCount=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number is:"+i);
				evenCount++;
				
			}
			else
			{
				System.err.println("odd number is"+i);
				OddCount++;
			}
		}
		System.out.println("totaleventcount:"+evenCount);
		System.out.println("totaloddtcount:"+OddCount);
		
	}

}
