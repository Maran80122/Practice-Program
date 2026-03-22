package Inheritance;
//single Parent Multiple Child
class Shape
{
	public void display()
	{
		System.out.println("Inside display");
	}
	
}
class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("Inside area");
	}
}
class Cube extends Rectangle
{
	public void volume()
	{
		System.out.println("Inside volume");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube=new Cube();
		cube.display();
		cube.area();
		cube.volume();
		
	}

}
