package Encapsulation;

public class Encapsulation {
private String name ;   //private member variable
	
	public String getname() {
		return name;
	}
public void setName(String name) {
	this.name=name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation e=new Encapsulation();
		e.setName("hai");
	System.out.println(e.getname());

	}

}


//write a program to create a class of bank account within private instance variable account number and balance provide public getter and setter method to ac