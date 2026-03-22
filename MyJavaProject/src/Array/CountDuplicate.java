package Array;

public class CountDuplicate {
	public static int countDuplicates(int[] arr)
	{
		int n=arr.length;
		boolean[] visited= new boolean[n];
		int duplicateCount=0;
		for(int i=0;i<n;i++)
		{
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					visited[j]=true;
					count++;
				}
					
					
			}
		if(count>1)	
		{
			duplicateCount++;
		}
		}
		return duplicateCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,5,2,1,3,4,5,3,2};
		int duplicate=duplicate(arr);
		System.out.println(duplicate);

	}

}
