package javaa.thiss.methodParameter;

public class Student {

	private int id;
	private String name;
	
	public Student() {
		super();
		this.id = 10;
		this.name = "Neha";
	}
	
	public void show(Student student) {
		System.out.println("Id is : "+student.id+", Name is : "+student.name);
	}
	
	public void dispaly() {
		show(this);
	}
}
