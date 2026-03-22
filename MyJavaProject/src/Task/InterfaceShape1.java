//Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//Implement the getArea() method for each of the three classes. Task;

interface Shape1{
	void getArea();
}
class Rectangle implements Shape1{
	private int length;
	private int breadth;
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	public void getArea()
	{
		int area=length*breadth;
		System.out.println(area);
	}
}
class Ring implements Shape1{
	
	private double radius;
	
	public Ring(double r)
	{
		this.radius=r;
	}
	public void getArea()
	{
		double area=Math.PI*radius*radius;
		System.out.println(area);
	}
}
class Triangle implements Shape1{
	private double height;
	 private double breadth;
	 
	public Triangle(double h,double b)
	{
		this.height=h;
		this.breadth=b;
	}
	public void getArea()
	{
		double area=0.5*height*breadth;
		System.out.println(area);
	}
}
public class InterfaceShape1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 r=new Rectangle(5, 6);
		r.getArea();
		
		
		Shape1 t=new Triangle(6, 6);
		t.getArea();
		
		Shape1 c=new Ring(7);
		c.getArea();
		
	}

}
