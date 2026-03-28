package javaa.relationships.hasArelationship.aggregation;

public class Professor {

	private String name;
	private String qualification;
	
	public Professor(String name, String qualification) {
		super();
		this.name = name;
		this.qualification = qualification;
	}
	
	public void dispalyProfessorDetails() {
		System.out.println("Name is : "+name+", Qualification is : "+qualification);
	}
}
