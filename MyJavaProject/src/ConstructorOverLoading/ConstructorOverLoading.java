package ConstructorOverLoading;

public class ConstructorOverLoading {
	private int id,age;
	private String name;
	
	ConstructorOverLoading(int i, String n) //pc
	{
		id=i;
		name=n;
		
	}
	ConstructorOverLoading(int i, String n,int a) // overloading pc
	{
		id=i;
		name=n;
		age=a;
		
	}
	void display()
	{
		System.out.println("the value of id , name, age:"+""+id+""+name+""+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoading c=new ConstructorOverLoading(101,"maran",22);
		ConstructorOverLoading c0=new ConstructorOverLoading(101,"maran");
		//c.display();
		c0.display();
		
		
		

	}

}
