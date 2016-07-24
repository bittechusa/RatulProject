package collection.org;
/**
 * author ratul
 * linked list work 
 */

import java.util.*;
public class LinkedListWork {

	public static void main(String[] args) {
		//adding
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("a");
		linkList.add("b");
		linkList.add("c");
		linkList.add("d");
		linkList.add("e");
		linkList.add("b");
		linkList.add(3, "ratul");
		linkList.addFirst("ratul");
		linkList.addLast("Ashraf");
		System.out.println(linkList);
		//removing
		linkList.removeFirst();
		linkList.remove(3);
		System.out.println(linkList);
		//appending
		LinkedList<String> anotherLinkList = new LinkedList<String>();
		anotherLinkList.add("y");
		anotherLinkList.add("u");
		anotherLinkList.add("i");
		anotherLinkList.addAll(linkList);
		System.out.println(anotherLinkList);
		//cloning list
		anotherLinkList =(LinkedList<String>) linkList.clone();
		System.out.println(anotherLinkList);
		//getting the element of last occurance
		System.out.println("last occurence of b:"+linkList.lastIndexOf("b"));
		//understand push and pop operation
		linkList.push("adding first");
		System.out.println(linkList);
		System.out.println("removes and returns the first element:"+linkList.pop());
		//understanding polling 
		linkList.poll();
		System.out.println("after polling"+linkList);
		linkList.pollLast();
		System.out.println("after pollingLast "+linkList);
		//converting linkedList to arrayList
		List<String> convertingList =new ArrayList<>(linkList);
		for (String convertData : convertingList) {
			System.out.println("Converting ArrayList:"+convertData);
		}
		//converting linkedlist to array
		String[] convertArray =linkList.toArray(new String[linkList.size()]);
		for (String convertArrayData : convertArray) {
			System.out.println("convert array:"+convertArrayData);
		}
	}

}
