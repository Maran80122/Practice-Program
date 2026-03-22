package Constructor;

public class CopyConstructorEx {
	
	private int x;
	private String s;
	
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
		 this(obj.x,obj.s);
	}
	public static void main(String args[]) 
	{
		
		// TODO Auto-generated method stub
		
		CopyConstructorEx c1=new CopyConstructorEx(1,"hii");
//		CopyConstructorEx c2=new CopyConstructorEx(2,"man");
		CopyConstructorEx c3=new CopyConstructorEx(c1);
		System.out.print(c3.s+c3.x);

	}

}
