//write a program to use encapsulation that bind to emp id,emp name,empn location that variable  can be accessed within same 
package Task;

public class EncapsulationTask1 {
private Integer emp_Id;
private String name;
private String emp_Location;
 
	public Integer getEmp_Id()
	{
		return  emp_Id;
		
	}
	public String getName()
	{
		return name;
	}
	public String getEmp_Location()
	{
		return emp_Location;
	}
		public void setEmp_Id(int emp_Id)
		{
			this.emp_Id =emp_Id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setEmp_Location(String emp_Location)
		{
			this.emp_Location=emp_Location;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTask1 c=new EncapsulationTask1();
		c.setEmp_Id(1);
		c.setName("Maran");
		c.setEmp_Location("trichy");
		
		System.out.println("employee Id"+":"+ c.getEmp_Id());
		System.out.println("employee Name"+":"+ c.getName());
		System.out.println("employee Location"+":"+ c.getEmp_Location());
		

	}

}
