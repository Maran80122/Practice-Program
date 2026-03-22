package Abstraction;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	
}
class Circle implements Drawable{
	public void draw()
	{
		System.out.println("drawing circle");
	}
}

public class InterfaceAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Circle();
		d.draw();
		Drawable d1=new Rectangle();
		d1.draw();

	}

}
