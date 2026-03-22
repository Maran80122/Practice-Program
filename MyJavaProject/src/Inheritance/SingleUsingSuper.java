package Inheritance;
class Singer
{
	public void sing()
	{
		System.out.println("Singer sing a song");
	}
}
class MusicDirector extends Singer{
	public void sing()
	{
		super.sing();
		System.out.println("");
	}
}
public class SingleUsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleUsingSuper c=new SingleUsingSuper();
		c.sing();
	}

}
