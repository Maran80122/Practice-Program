package ArrayToArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Integer[] array1= {1,2,3,4};  //array using Integer
	System.out.println(Arrays.toString(array1));
	
	
	//convert a array to arrayList
	ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(array1));
	
	System.out.println(arrayList);//arraylist
	
	
	Integer[] array2= {1,5,6,7,8}; //array using int
	List<Integer> arr1=new ArrayList<>(Arrays.asList(array2));

	System.out.println("\nArrayList2 : " +arr1);
//	arrayList.addAll(arr1);
	arrayList.retainAll(arr1);
	System.out.println("\nArrayList3 : " +arrayList);
	

	}

}
