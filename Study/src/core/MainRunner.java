package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainRunner {
	
	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3,"Dol","NonT"));
		
		empList.add(new Employee(2,"Alfaz","TechNo"));
		
		empList.add(new Employee(4,"A","All"));
		empList.add(new Employee(1,"Faiyaz","Tech"));
		
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);
		
		Collections.sort(empList,new EmployeeComprator());
		
		
		System.out.println(empList);
	}
	

}
