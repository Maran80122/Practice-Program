package array;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="gopal oru paiyan";
		String reverse="";
		
//		<************************in built function*********************************>
//		String reverse=new StringBuilder(str).reverse().toString();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		
		
		
			System.out.println(reverse);
	}

}
