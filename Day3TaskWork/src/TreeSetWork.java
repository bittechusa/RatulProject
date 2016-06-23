import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWork {

	public static void main(String[] args) {
		HashSet<String> hSet =new HashSet<String>();
		hSet.add("ratul");
		hSet.add("uddin");
		hSet.add("ashraf");
		// coverting hashset to tree set
		Set<String> convertToTreeSet =new TreeSet<String>(hSet);
		for (String treeSetData : convertToTreeSet) {
			System.out.println(treeSetData);
		}

	}

}
