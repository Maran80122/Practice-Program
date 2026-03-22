package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> even=new TreeSet<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		System.out.println("even:"+even);
		
		List<Integer> l1=Arrays.asList(6,8,10,12);
		even.addAll(l1);
		System.out.println(even);
		
		List<Integer> l2=new ArrayList<>(even);
		System.out.println(l2);
		
		
		
		

	}

}
