package Task;

public class Circle {
	private double radius;
	
	public  double getRadius() {
		return radius  ;
	}
	public void setRadius(double radius  ) {
		this.radius=radius;
	}
	public double CalculateArea() {
		return Math.PI * radius * radius;
		
	}
	public double CalculatePerimeter() {
		return 2 * Math.PI * radius ;
	}

	public static void main(String args[]) {
		Circle c=new Circle();
		c.setRadius(3.6);
		System.out.println("enter a radius"+c.getRadius());
		System.out.println("Area of circle"+c.CalculateArea());
		System.out.println("Perimeter of circle"+c.CalculatePerimeter());
		
		
		

		}
}
