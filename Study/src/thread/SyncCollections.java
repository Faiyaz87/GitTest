package thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class SyncCollections {
	
	public static void main(String[] args) {
		
		List<String> scList = Collections.synchronizedList(new ArrayList<String>());
		
		Collection<String> scColl= Collections.synchronizedCollection(new TreeSet<String>());
		System.out.println(scColl);
	}

}
