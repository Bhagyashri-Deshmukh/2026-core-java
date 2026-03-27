package javaa.constructor.copy;

public class Student {

	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		System.out.println("Parameterised constructor is called!");
	}

	public Student(Student student) {
		this.id = student.id;
		this.name = student.name;
		
		System.out.println("Copy Constructor is called!");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
