package methods;

//Write a method to count vowels in a string.
//Example: Input → "hello world" → Output → 3

public class CountVowels {
	public static int  count(String s)
	{
		int count=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		System.out.println(count(s));

	}

}
