package Array;

public class StringArrayImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] courses= {"JFS","PFS","DFS","MFS"};
			//access through index value
			System.out.println("the third courses is"+courses[2]);
			//length of the element
			System.out.println("length of array"+courses.length);
			
			
			int[] arr= {1,2,3,4,5};
			//size  of an array
			int n=arr.length;
			//traversing array
			for(int i =0;i<n;i++)
			{
				System.out.println(arr[i]+"");
			}
			
//	<-----------------------------sum ------------------------------------------>		
			int my_array[]= {1,2,3,4,5};
			int sum=0;
			for(int i:my_array)
			{
				sum+=i;
				System.out.println("the sum is"+sum);
			}
			
			
//	<------------------------average --------------------------------------------------->		
			int arr1[]= {2,3,45,5,9};
			int n=arr1.length;
			int sum=0;
			for(int i:arr1)
			{
				sum+=i;
				System.out.println("the sum of number is:"+sum);
			}
			System.out.println("total value"+sum);
			System.out.println("average "+ sum/n);
			
	}

}
