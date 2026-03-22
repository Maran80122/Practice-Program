package ConstructorFactoryMethod;
//singleton design pattern
//to avoid private field constructor,there must be
//singleton design pattern to ensure only one
//insrtance of a class exists throughtout the appplication



public class ConstructorFactoryMethod {
	private String name,department;
	private int age;
	private ConstructorFactoryMethod(String name,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	public static ConstructorFactoryMethod createFactoryMethod(String name,int age,String department)
	{
		return new ConstructorFactoryMethod(name,age,department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorFactoryMethod c=ConstructorFactoryMethod.createFactoryMethod("Ajay",23,"IT");
		ConstructorFactoryMethod c1=ConstructorFactoryMethod.createFactoryMethod("Akash",24,"ITI");
		System.out.println("name"+""+c.name+" "+"age"+c.age+" "+c.department);
		System.out.println("name"+""+c1.name+" "+"age"+c1.age+" "+c1.department);
	}

}
