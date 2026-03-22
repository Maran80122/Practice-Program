package test;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n=5;
				for(int i=n;i>=1;i--)
				{
					for(int j=1;j<=n-i;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=n-1;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				
	}

}
