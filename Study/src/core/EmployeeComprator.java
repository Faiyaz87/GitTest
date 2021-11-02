package core;

import java.util.Comparator;

public class EmployeeComprator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmpDepartment().compareTo(o2.getEmpDepartment());
	}
	
	

}
