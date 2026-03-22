package ConstructorWithArray;

import java.util.ArrayList;
import java.util.List;

public class ConstructorWithArray {
	private final List<Person> people=new ArrayList<>();
	private static class Person
	{
		private final String name;
		private final int age;
		
		Person(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
	}
	public void addPerson(String name,int age)
	{
	if(name ==null||name.isBlank())
	{
		System.out.println("invalid data");
		return;
	}
	
	people.add(new Person(name,age));
	}
	
	public void displaypeople()
	{
		for(Person p:people)
		{
			System.out.println("name"+" "+p.name+ " "+"age"+p.age);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithArray  o=new ConstructorWithArray();
		o.addPerson("maarn", 4);
		o.addPerson("manoj",9 );
		o.addPerson("", 6);
		o.displaypeople();
	}

}
