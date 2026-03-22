package Constructor;

public class ConstructorParameter {
	int id;
	String name;
	public ConstructorParameter(int i , String n)
	{
		id= i;
		name=n;
		
	}
	public void display()
	{
		System.out.println("the id value:" + id+","+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameter c=new ConstructorParameter(1,"maran");
		ConstructorParameter c1=new ConstructorParameter(2,"prithiv");
		c.display();
		c1.display();

	}

}
