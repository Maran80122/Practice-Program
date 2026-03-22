package Task;

class Employee
{
	public void work()

{
		System.out.println("employee is working");
}
	public double getSalary()
	{
		return 25000;
	}
}
class HRManager extends Employee
{
	public void work()
	{
		System.out.println("Hr manager is managing employee");
	}
	public void addEmployee()
	{
		System.out.println("to assign a new employee");
	}
}
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager hr=new HRManager();
		hr.work();
		System.out.println("salary"+ hr.getSalary());
		hr.addEmployee();
		
	}

}
