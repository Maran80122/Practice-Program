package methods;


//Write a method to find the average of an array of numbers.
//Example: Input → {10, 20, 30, 40, 50} → Output → 30
public class AverageInarray {
	public static double avgArray(int[] a)
	{ 
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum:"+sum);
		return  sum /a.length;
		
		
	}
	

	public static void main(String[] args) {
		int[] a= {10, 20, 30, 40, 50};
		System.out.println("average"+avgArray(a));
		
		
}
}