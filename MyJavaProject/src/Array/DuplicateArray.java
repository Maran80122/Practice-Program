package Array;

public class DuplicateArray {
	public static int removeDuplicate(int[] arr)
	{
		if(arr.length==0)
			return 0;
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
			
				arr[j]=arr[i];
				j++;
			}
		}
		return j+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,3,4,5,5};
		int length=removeDuplicate(arr);
		System.out.println("array after removing duplicate:");
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]+"");
		}

	}

}
