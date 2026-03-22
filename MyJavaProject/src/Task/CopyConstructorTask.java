package Task;

public class CopyConstructorEx {
	
	private int x;
	private string s;
	
	CopyConstructorEx(int x,String s)  // parameter constructor
	{
		this.x=x;
		this.s=s;
		
	}
		//copy constructor
	
	public CopyConstructorEx(CopyConstructorEx obj)
	{
//		 this.x=obj.x;
//		 this.s=new String(obj.s);
		 rhis(obj.x,obj.s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
