package Array;

class Person{
	String name;
	int age;
Person(String name,int age)
{
	this.name=name;
	this.age=age;
}
public void display()
{
	System.out.println(name+"is a "+age+"age");
}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person1=new Person[3];
		person1[0]=new Person("maran",22);
		person1[1]=new Person("prithiv",24);
		person1[2]=new Person("manoj",24);
		
		for(int i=0;i<person1.length;i++)
		{
		person1[i].display();
		}
		

	}

}
