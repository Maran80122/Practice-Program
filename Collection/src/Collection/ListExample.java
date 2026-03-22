package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// List: Allows Duplicate,ordered
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("j2EE");
		list.add("java sccript");	
		list.add("j#");
		list.add("j servelts");
		System.out.println("the lists are"+ list);

		///Access by index
		
		System.out.println("Second items"+list.get(1));
		
		//remove --remove by index
		System.out.println("removing second items"+list.remove(1));
		System.out.println("after removing 2nd items"+list);
		//size of the element
		System.out.println("list size is:"+list.size());
		//update Elements
		System.out.println("Before Printing"+list);
		System.out.println("After printing");
		list.set(2,"Advanced java");
		
		//sort using collection
		Collections.sort(list);
		//index of
		System.out.println("indexof"+list.indexOf("java"));
		
		
		
		// to iterate
		for(String items:list)
		{
			System.out.println("the list are"+items);
		}
			

	}

}
