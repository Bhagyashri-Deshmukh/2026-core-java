package javaa.thiss.invokeConstructor;

public class Student {

	private int id;
	private String name;
	public Student() {
		this(100,"Neha");
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
