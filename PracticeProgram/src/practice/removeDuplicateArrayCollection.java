package practice;

import java.util.Arrays;
import java.util.*;


public class removeDuplicateArrayCollection {
	 public static void main(String[] args) {
	        int a[] = {1, 1, 3, 4, 53, 2};

//	        Set<Integer> d=new HashSet<Integer>();   //  hashset
	        Set<Integer> d=new LinkedHashSet<Integer>();   // linkedhashset
//	        Set<Integer> d=new TreeSet<Integer>();      //treeset
	        for(int i:a)
	        {
	        		d.add(i);
	        }
	  
//	        System.out.println(d);         // hashset
	        
	        Integer[] u=d.toArray(new Integer[0]);    // linkedhashset
	        System.out.println(Arrays.toString(u));    // linkedhashset
	        
	        
	    }
	}