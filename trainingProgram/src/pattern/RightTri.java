package pattern;

public class RightTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		right ttriangle
//		
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		
//		inverse right
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
//		mirror right
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		inverse mirror right
//		for(int i=5;i>0;i--)
//		{
//			for(int j=0;j<5-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
	}

}
