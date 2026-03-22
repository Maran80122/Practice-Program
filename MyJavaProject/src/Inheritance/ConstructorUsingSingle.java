package Inheritance;


class Person{
	Person()
	{
		System.out.println("person using class constructor");
		
	}
}
class Student extends Person
{
	Student()
	{
		super();
		System.out.println("student using class constructor");
	}
}
public class ConstructorUsingSingle {

	public static void main(String[] args) {
		Student s=new Student();
		// TODO Auto-generated method stub
//		Person p=new Person();
		
//	Person s=new Student();
//	s.Person();
	}

}
