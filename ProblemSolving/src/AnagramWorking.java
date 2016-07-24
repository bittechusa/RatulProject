import java.util.Arrays;

public class AnagramWorking {

	public static Boolean isAnagram(String first,String second ) {
		char[] fst =first.toLowerCase().replaceAll("\\W", "").toCharArray();
		char [] snd =second.toLowerCase().replaceAll("\\W", "").toCharArray();
		Arrays.sort(fst);
		Arrays.sort(snd);
		return Arrays.equals(fst, snd);
	}
	public static void main(String[] args) {
	
		System.out.println(isAnagram("ra tul", "lutar"));
		System.out.println();
	}

}
