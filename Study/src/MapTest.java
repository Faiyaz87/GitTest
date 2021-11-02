import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> tMap = new HashMap<String, String>();
		tMap.put("A", "AAAAAAA");
		tMap.put("B", "bbbb");
		tMap.put("C", "cccc");
		tMap.put("D", "dd");
		tMap.put("E", "eeee");
	
		System.out.println(">> :"+tMap.entrySet());
		for (Entry<String, String> et : tMap.entrySet()) {
			System.out.println(et);
		}

	}

}
