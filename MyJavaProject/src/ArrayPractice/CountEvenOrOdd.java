package ArrayPractice;



public class CountEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,23,4,567,8,89,7};
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
	
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
