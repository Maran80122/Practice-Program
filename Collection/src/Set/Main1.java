package Set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


// Arrays.asList------convert multiple values into a list
//set.addAll(list)----adds all list element to the set

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new TreeSet<>();
		set.add("grapes");
		set.add("kiwi");
		set.add("Dragon");
		set.add("Blueberry");
		set.add("jamun");
		
	System.out.println("original set"+set);
	set.addAll(Arrays.asList("Banana","papaya"));
	System.out.println("add a value"+ set);
	set.removeAll(Arrays.asList("Blueberry","jamun"));
	System.out.println("the values is"+set);
		
	
	//wrapper primitive datatype
	Integer[] num= {2,3,4,5};
	List<Integer> list=Arrays.asList(num);
	System.out.println("List"+list);
	
	
	Set<Integer> set1=new TreeSet<>();
	set1.addAll(Arrays.asList(40,20,30,10));
	System.out.println(set1);
	
	
	
	
		
		
	}

}
