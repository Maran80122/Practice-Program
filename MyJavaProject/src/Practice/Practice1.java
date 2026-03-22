package Practice;
class Employee1{
	String empname;
	int empid;
	String empDestination;
	String empLocation;
	

Employee1(String n,int id,String d,String l)
{
	this.empname=n;
	this.empid=id;
	this.empDestination=d;
	this.empLocation=l;
	
	
}

public void show()
{
	if(empid>=3)
	{
		
		System.out.println("Name:"+" "+empname+" "+"empId:"+empid+" "+"empDestination:"+empDestination+" "+"empLocation"+" "+empLocation);
	}

}
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1("maran",1,"senior tester","chennai");
		Employee1 e1=new Employee1("prithiv",2,"senior tester","chennai");
		Employee1 e2=new Employee1("manoj",3,"senior tester","chennai");
		Employee1 e3=new Employee1("rubesh",4,"senior tester","chennai");
		Employee1 e4=new Employee1("tarriq",5,"senior tester","chennai");
		e.show();
		e1.show();
		e2.show();
		e3.show();
		e4.show();
	}

}
