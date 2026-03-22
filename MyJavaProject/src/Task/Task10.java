package Task;
class Shape
{
	public void getPerimeter()
	{
		System.out.println("shape of perimeter");
	}
	public void getArea()
	{
		System.out.println("shape of Area");
	}
}
class Circle1 extends Shape
{
	public double getPerimeter(double radius)
	{
		return 2*Math.PI*radius*radius;
	}
	public double getArea(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}
}
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c=new Circle1();
//		c.getPerimeter(3);
//		c.getArea(5);
		System.out.println(c.getPerimeter(3));
		System.out.println(c.getArea(5));
	}

}
