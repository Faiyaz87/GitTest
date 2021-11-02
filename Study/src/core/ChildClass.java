package core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChildClass{
	
	public static void main(String[] args) {
		ChildClass cs = new ChildClass();
		try {
			cs.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void test() throws Exception{
		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "");

		System.out.println(map);
		for (int x : map.keySet()) {
			System.out.println(x +"  "+map.get(x));
			map.put(5, "Five");
		}
	}

}
