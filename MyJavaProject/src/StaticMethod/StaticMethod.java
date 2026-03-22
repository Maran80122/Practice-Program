package StaticMethod;

import java.io.*;
public class StaticMethod {
	
	static int num=100; //static variable
	static String str=  "welcome to sla"; //static variable

	// static method is not accessed a object used in not mandatory
	// nonstatic method is used to accessed a object used in method
	
	//this is static method
	static void display()
	{
		System.out.println("Static number is:"+num);
		System.out.println("Static string is:"+str);
	}
	
	//non-Static method
	void nonstatic() {
		
		
		//our static method can accessed
		// in non static method
		display();//Static method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod obj= new StaticMethod();
		
		
		//this is object to call nonstatic method
		obj.nonstatic();
		
		
		// static method can called
		//directly without an object
		display();
		

	}

}
