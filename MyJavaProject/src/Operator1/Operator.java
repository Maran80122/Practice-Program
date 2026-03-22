package Operator1;

public class Operator {
	public static void main(String[] args) {
		int x= 5;
		int y=x++; 
		int z=++x;
//		System.out.println("post increment"+y);
		System.out.println("pre increment"+z);
		
		int a= 5;
		int b=a--; 
		int c=--a;
		System.out.println("post decrement"+b);
		System.out.println("pre decrement"+c);
		
//		//assignment operator
//		int q=2;
//		int r=3;
//		System.out.println(q+=r);//q=q+r
//		
//		
//		//comparion operators <,>,<=,==,>=
//		System.out.println("greater than:"+(q>r));
//		System.out.println("lesser than:"+(q<r));
//		System.out.println("equal to:"+(q==r));
//		System.out.println("greater than equal to:"+(q>=r));
//		System.out.println("lesser than equal to:"+(q<=r));
//		
////		logical operator
////		&&-and  ||-or  !-not   
///
//		boolean x=true;
//		boolean y=false;
//		
//		System.out.println((x && y));
//		System.out.println((x || y));
//		System.out.println((!x));
//		
	}

}
