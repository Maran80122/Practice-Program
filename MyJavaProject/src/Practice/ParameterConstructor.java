package Practice;
class Employee{
	String name;
	double salary;
	int empid;

Employee(String n,double s,int id)
{
	this.name=n;
	this.salary=s;
	this.empid=id;
//	System.out.println("empName:"+" "+name+" "+"empid"+empid+" "+"salary"+" "+salary);
	
	
}
public void display()
{
	System.out.println("empName:"+" "+name+" "+"empid"+empid+" "+"salary"+" "+salary);
}
}


public class ParameterConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("maran",3849.09,2);
		Employee e1=new Employee("prithiv",3849.09,3);
		e.display();
		e1.display();
		

	}

}
