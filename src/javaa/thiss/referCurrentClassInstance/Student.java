package javaa.thiss.referCurrentClassInstance;

public class Student {

	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		
		//this keyword to refer to current class instance
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
