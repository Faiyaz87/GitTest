package compare;

public class Emp implements Comparable<Emp>{
	private String name;
	private Integer id;
	

	public Emp(String name) {
		super();
		this.name = name;
	}
	public Emp(Integer id , String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Emp o) {
		
		return this.getId().compareTo(o.getId());
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	

}
