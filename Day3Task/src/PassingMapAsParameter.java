import java.util.HashMap;
import java.util.Map;

public class PassingMapAsParameter {
    public static Map<String, String> PassMap(Map<String, String> pass ) {
    	pass.put("FirstName", "ratul");
    	pass.put("LastName","Uddin Ashraf");
    	return pass ;
    }
	public static void main (String args[]) {
    	Map<String, String> inputData = new HashMap<String,String>();
    	inputData.put("Department", "ICT");
    	inputData.put("University", "MBSTU");
    	System.out.println("Here is parameterPassing:"+PassMap(inputData));
    }
}