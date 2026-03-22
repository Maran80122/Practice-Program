package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAppllication {

	public static void main(String[] args) {
		// set types-Hashset(most likely),LinkedHash set,Tree set
		Set<String> fruits=new HashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("banana");
		fruits.add("avakoda");
//		fruits.set(1,"pineapple"); // no index unable to use it in set
		
		//set -------passing to the list
		List<String> sortedSet=new ArrayList<>(fruits);
		
		Collections.sort(sortedSet);
		System.out.println(sortedSet);
		
		System.out.println("the hashset is"+" " +fruits);
		
		Set<String> fruits1=new HashSet<>();
		fruits1.add("watermelon");
		fruits1.add("musk melon");
		fruits1.add("guva");
		fruits1.add("strawberry");
		
		//set -------passing to the list
		List<String> sortedSet1=new ArrayList<>(fruits1);
		
		Collections.sort(sortedSet1);
		System.out.println(sortedSet1);
		System.out.println("fruits1"+fruits1);
		
		// Collections.sort(fruits);  // collection does not worked in hashset there is used to a covert a list

		
		
		System.out.println(fruits1.contains("guva"));
		
		//addAll (add unique elements)
		fruits.addAll(fruits1);
		System.out.println("add a fruits:"+fruits);
		
		// retainAll     (keep common elements)
		fruits.retainAll(fruits1);
		System.out.println("keep a commomn fruits "+fruits);
		

	}

}
