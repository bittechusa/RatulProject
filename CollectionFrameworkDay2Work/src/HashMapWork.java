import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class HashMapWork
{
    public static void main(String [] args)
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Adding elements to HashMap
        hmap.put(9, "A");
        hmap.put(3, "D");
        hmap.put(8, "F");
        hmap.put(6, "H");
        hmap.put(5, "J");
        /*
        for (Map.Entry me : hmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + "  Value: " + me.getValue());
        }*/
        Set set =hmap.entrySet();
        Iterator iterator =set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry entry =(Map.Entry)iterator.next();
        	System.out.println("key is :"+ entry.getKey() +"get value :"+entry.getValue());
        	
        }
        // size of the hashmap
        System.out.println(hmap.size());
        //searhing the specific key and value
        System.out.println("searching the specific key:"+hmap.containsKey(3));
        System.out.println("searching the specific value:"+hmap.containsValue("H"));
        // removing the specific key value, removing all and checking is empty or not
        hmap.remove(9);
        System.out.println("after removing the specific key:"+hmap);
        System.out.println("checking empty or not:"+hmap.isEmpty());
        hmap.clear();
        System.out.println("After clearing method:"+hmap);
        
}
}