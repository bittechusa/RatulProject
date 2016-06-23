package collection.org;


/**
 * ArrayListWork
 */
import java.util.*;
import java.util.Collections;

public class ArrayListWork {
	ArrayList<String> myList = new ArrayList<String>(5);
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>(5);
		//adding 
		myList.add("ratul");
		myList.add("uddin ");
		myList.add("ashraf");
		myList.add("Base4");
		
		//checking an element
		int check =myList.indexOf("ashraf");
		System.out.println("it returns specfic index of the element:"+check);
		//Retrieving specific element
		for (String store : myList) {
			System.out.println("specific element of the index:"+store); 
		}
		// to search an element in the arrayList
		 
		Boolean search=myList.contains("Base4");
		System.out.println(search);
		//removing an element 
		System.out.println("Removing :"+myList.remove(1));
		//copying arraylist from another arraylist
		ArrayList<String> anotherList =new ArrayList<String>();
		anotherList.addAll(myList);
		for (String dataCopy : anotherList) {
			System.out.println(dataCopy);
			
		}
		
		
	}

}
