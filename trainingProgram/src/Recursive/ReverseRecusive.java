package Recursive;



public class ReverseRecusive {
		static String reverse(String s) 
		{
			if(s.length()<=1)
			{
			  return s;
			}
		
			return(s.substring(1)+s.charAt(0)); 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="maran";
		String r=reverse(s);
		
		System.out.println("original:"+" "+s);
		System.out.println("reverse:"+" "+r);
	
//	
//	public static void main(String[] args) {
//		
//		String s="hello";
//		String r="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			r+=s.charAt(i);
//		}
//		System.out.println(r);

	}

}
