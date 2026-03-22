package practice;

import java.util.ArrayList;
import java.util.List;

public class ConvertAlphabetToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello";
//		List<Integer> result=new ArrayList<>();
//		
//		for(int c:s.toCharArray())
//		{
//			int position=c-'a'+1;
//			result.add(position);
//		}
//		
//		System.out.println(result);	
		

        int[] result = new int[s.length()];  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);         
            int position = (c - 'a') + 1; 
            result[i] = position;           
        }

     
        for (int num : result) {
          System.out.print(num + " ");

        }
	}
}
		
		
	


