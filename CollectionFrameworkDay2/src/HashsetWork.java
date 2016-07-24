import java.util.*;
public class HashsetWork {

	public static void main(String[] args) {
		HashSet<String> hashset =new HashSet<String>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("d");
		hashset.add("e");
		hashset.add("f");
		//duplicate value
		hashset.add("a");
		//null value
		hashset.add(null);
		hashset.add(null);
		hashset.add(null);
		System.out.println(hashset);
		//removing an elements
		Iterator<String> iterator =hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println("After iterating:");
			System.out.println(iterator.next());
		}
		hashset.remove("d");
		System.out.println(hashset);
		
		System.out.println("After cleaning all elements:");
		//  converting hashset to array
		HashSet<Integer> number = new HashSet<Integer>();
		number.add(10);
		number.add(2);
		number.add(30);
		Integer[] convertingArray = new Integer[number.size()];
		number.toArray(convertingArray);
		System.out.println("array elements:");
		for (Integer integerData : convertingArray) {
			System.out.println(integerData);
		}
		
		//converting hashset to arrayList
		List<String> convertArrayList =new ArrayList<>(hashset);
		Iterator<String> itrator =convertArrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println("After converting ArrayList:"+iterator.next());
		} 
		// coping one hashmap content to anotherHashmap
		HashSet<String> anotherHashset = new HashSet<String>();
		anotherHashset.add("ratul");
		anotherHashset.add("uddin");
		anotherHashset.add("ashraf");
		anotherHashset.addAll(hashset);
		for (String anotherHashsetData : anotherHashset) {
			System.out.println(anotherHashsetData);
		}
		//deleting all elements
  		
		hashset.clear();
		
	}

}
