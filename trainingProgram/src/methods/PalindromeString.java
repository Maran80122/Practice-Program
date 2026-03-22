package methods;

public class PalindromeString {
	public static boolean  palin(String s)
	{
		int left=0;
		int right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		s=s.toLowerCase();
		s=s.replaceAll("[^a-z0-9]", "");
		System.out.println(s);
		palin(s);
		String result=palin(s)? "palindrome":"not palin";
		System.out.println(result);
	}

}
