import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizeHashMapWork {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hashMap =new HashMap<Integer,String>();
		hashMap.put(10, "Department");
		hashMap.put(8, "Subject");
		hashMap.put(13, "student");
		Map map = Collections.synchronizedMap(hashMap);
		Set set =map.entrySet();
		synchronized (map) {
			Iterator iterator =set.iterator();
			while(iterator.hasNext()) {
				Map.Entry mapEntry =(Map.Entry)iterator.next();
				System.out.println("Key is" +mapEntry.getKey() +" value is: "+mapEntry.getValue());
				
			}
		}
		
		
	}

}
