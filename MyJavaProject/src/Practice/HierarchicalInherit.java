package Practice;
class Animal{
	void eat()
	{
		System.out.println("animals eats food");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barks");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("cat meow");
	}
}

public class HierarchicalInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();
		d.eat();
		Cat c=new Cat();
		c.eat();
		c.meow();
	}

}
