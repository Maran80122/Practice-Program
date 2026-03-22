package Practice;

//Write a Java program using single inheritance with a Person class and a Student subclass.

class Person
{
	void display()
	{
		System.out.println("perrson is a hm");
	}
}
class Student extends Person
{
	void show()
	{
		display();
		System.out.println("students are very well");
	}
}




public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student p=new Student();
		p.show();

	}

}
