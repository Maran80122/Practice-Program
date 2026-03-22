package array2D;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		compile time  2d arrray
		
		
		int[][] a={{1,2,2,3},{2,4,5,5}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
				
	}

}
