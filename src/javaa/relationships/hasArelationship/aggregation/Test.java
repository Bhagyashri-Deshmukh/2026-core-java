package javaa.relationships.hasArelationship.aggregation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor("Dr. Neha", "PhD");
		
		Department department = new Department("Computer Science", professor);
		
		department.dispalyDepartmentInfo();
	}

}
