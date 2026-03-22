package Task;

import java.util.Scanner;

public class Constructor1Task {
	String name;
	int id;
	String location;
	float salary;
	
	public Constructor1Task(String n,int i, String l, float s)
	{
		name=n;
		id=i;
		location=l;
		salary=s;
	}
	public void display()
	{
		System.out.println("Enter the name:"+ name);
		System.out.println("Enter the emp_id:"+ id);
		System.out.println("Enter the location:"+ location);
		System.out.println("Enter the salary:"+ salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Constructor1Task t=new Constructor1Task("maran",1,"trichy",25000);
//		Constructor1Task t1=new Constructor1Task("prithiv",2,"chennai",28000);
//		t.display();
//		t1.display();
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a name");
//		String a=sc.next();
//		System.out.println("enter the emp_id");
//		int b=sc.nextInt();
//		System.out.println("enter the location");
//		String c=sc.next();
//		System.out.println("enter the salary");
//		float f=sc.nextFloat();
//		
//		System.out.println("enter a first details");
//		Constructor1Task t=new Constructor1Task(a ,b,c,f);
//		t.display();
//		
	
	
	
		
		
		
		
		
		
		
		

	}

}
