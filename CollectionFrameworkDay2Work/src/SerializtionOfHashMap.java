import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class SerializtionOfHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap =new HashMap<Integer,String>();
		hashMap.put(10, "A");
		hashMap.put(9, "B");
		hashMap.put(7, "d");
		hashMap.put(3, "e");
		try {
			FileOutputStream fileOutStream =new FileOutputStream("hashmap.ser");
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutStream);
			objectOutputStream.writeObject(hashMap);
			objectOutputStream.close();
			fileOutStream.close();
			System.out.println("serializabe data is saved");
		} catch (Exception e) {
			System.out.println("something wrong:");
		}
	}

}
