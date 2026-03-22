package Inheritance;
class Ingredients
{
	public void Items()
	{
		System.out.println("Ingredients");
	}
}
class ItalianDish extends Ingredients
{
	public void Itali()
	{
		System.out.println("recipe");
	}
}
class MexicanDish extends Ingredients
{
	public void mexica()
	{
		System.out.println("diiferent variety");
	}
}
class Fusion extends  ItalianDish
{
	public void fus()
	{
		System.out.println("taste");
	}
}

public class HybridTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fusion fr=new Fusion();
		fr.fus();
		fr.Itali();
	
	}

}
