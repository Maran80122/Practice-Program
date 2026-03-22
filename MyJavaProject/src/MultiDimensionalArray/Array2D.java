package MultiDimensionalArray;

public class Array2D {

	public static void main(String[] args) {
		// Access the element
		int[][] a= {{1,2,3,4},{5,6,7}};
		System.out.println("print:"+""+a[1][2]);
		
		//changes the element
		int[][] a1= {{1,2,4,3},{5,6,7}};
		a1[1][2]=9;
		System.out.println("changes:"+a1[1][2]);
		
	}

}
