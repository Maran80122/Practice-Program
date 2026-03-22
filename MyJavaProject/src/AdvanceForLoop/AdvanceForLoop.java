package AdvanceForLoop;

public class AdvanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4}; // []array
//		String name[]= {"one","two","three"};
		int sum=0;
		
//		for(datatype item:array)
		for(int number:a)   //passing number to a[]  number means variable    
		{
			sum+=number;
		}
			System.out.println(sum);
	}

}
