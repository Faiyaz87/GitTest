package core;

public class Employee implements Comparable<Employee>{
	
	private Integer empId;
	private String empName;
	private String empDepartment;
	
	
	
	public Employee(Integer empId, String empName, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}

	
	
	
	public Integer getEmpId() {
		return empId;
	}




	public void setEmpId(Integer empId) {
		this.empId = empId;
	}




	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public String getEmpDepartment() {
		return empDepartment;
	}




	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}




	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
		
	}
	
	

}
