package javaa.relationships.hasArelationship.aggregation;

public class Department {

	private String departmentName;
	private Professor professor;
	
	public Department(String departmentName, Professor professor) {
		super();
		this.departmentName = departmentName;
		this.professor = professor;
	}
	
	public void dispalyDepartmentInfo() {
		System.out.println("Department name is : "+departmentName);
		professor.dispalyProfessorDetails();
	}
}
