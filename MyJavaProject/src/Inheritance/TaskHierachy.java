package Inheritance;
class Recipe
{
	public void getIngredients()
	{
		System.out.println("pasta,salad,cake");
	}
	public void getInstruction()
	{
		System.out.println("cook,bake,mixing");
	}
}
class PastaRecipe extends Recipe
{
	public void getIngredients()
	{
		System.out.println("onion,masala,pasta");
	}
	public void getInstruction()
	{
		System.out.println("cook");
	}
}
class CakeRecipe extends Recipe
{
	public void getIngredients()
	{
		System.out.println("bread,cream,flavor");
	}
	public void getInstruction()
	{
		System.out.println("bake");
	}
}
class SaladRecipe extends Recipe
{
	public void getIngredients()
	{
		System.out.println("Fruits, honey,milk");
	}
	public void getInstruction()
	{
		System.out.println("mixing");
	}
}
public class TaskHierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PastaRecipe p=new PastaRecipe();
		CakeRecipe c= new CakeRecipe();
		SaladRecipe s=new SaladRecipe();
		p.getIngredients();
		p.getInstruction();
		
		c.getIngredients();
		c.getInstruction();
		
		s.getIngredients();
		s.getInstruction();
		
	}

}
