package Abstraction;
abstract class Employee{
	public abstract void calculateSalary();
	public abstract void displayinfo();
	
}
class Manager extends Employee{
	public void calculateSalary() {
		System.out.println("salary");
	}
	public void displayinfo() {
		System.out.println("info");
	}
	
}
class Programmer extends Employee{
	
	public void calculateSalary() {
		System.out.println("salary1");
	}
	public void displayinfo() {
		System.out.println("info1");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager a=new Manager();
		a.calculateSalary();
		a.displayinfo();
		
		Programmer b=new Programmer();
		b.displayinfo();
		b.calculateSalary();

	}

}
//Write a Java program to create an abstract class Employee with abstract methods 
//calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend 
//the Employee class and implement the respective methods to calculate salary and display information for each role