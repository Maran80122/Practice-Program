package poly;

public class Poly {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	public String add(String a,String b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p=new Poly();
		System.out.println("sum is"+p.add(2,3));
		System.out.println("sum is"+p.add(2,3,5));
		System.out.println("sum is"+p.add(2.3,3.5));
		System.out.println("sum is"+p.add("hi","Sla"));
		
	}

}
inheritance