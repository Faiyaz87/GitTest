package compare;

import java.util.ArrayList;
import java.util.Collections;

public class Comp {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(3,"Faiyaz"));
		list.add(new Emp(2,"Alfaz"));
		list.add(new Emp(1,"Azyaz"));
		Collections.sort(list,new MyComparator());
		System.out.println(list);

	}
	
	

}
