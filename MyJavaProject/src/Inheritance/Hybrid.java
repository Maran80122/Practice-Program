package Inheritance;
class Grandma
{
	public void ShowG()
	{
		System.out.println("Grandma");
	}
}
class Mother extends Grandma
{
	public void ShowM()
	{
		System.out.println("she is mother");
	}
}
class Daughter extends Mother
{
	public void ShowD()
	{
		System.out.println("she is daughter");
	}
}
class Son extends Mother
{
	public void ShowS()
	{
		System.out.println("he is son");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter obj=new Daughter();
		obj.ShowD();
		obj.ShowM();
		obj.ShowG();
		
		Son obj1Son=new Son();
		obj1Son.ShowS();
		obj1Son.ShowM();
		obj1Son.ShowG();
		
	}

}
