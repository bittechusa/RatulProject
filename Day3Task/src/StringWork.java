
public class StringWork {

	public static void main(String[] args) {
		// some of the basic methods of string
		String s = "This work is for CharAt";
	      char result = s.charAt(8);
	      System.out.println(result);
	    //comparing  strings
	      String str1 = "Strings work is very intersting";
		  String str2 = "Strings work is very intersting";
	      String str3 = "Integers are not immutable";

	      int output = str1.compareTo( str2 );
	      System.out.println(output);
		  
	      output = str2.compareTo( str3 );
	      System.out.println(output);
		 
	      output = str3.compareTo( str1 );
	      System.out.println(output);
	      // showing hascode
	      System.out.println("the hash code of the str1 is:"+str1.hashCode());
	      // indexOf methods
	      System.out.println("index of the methods:"+str1.indexOf('t', 3));
	}

}
