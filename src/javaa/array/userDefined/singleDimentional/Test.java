package javaa.array.userDefined.singleDimentional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] students = new Student[3];
		
		students[0] = new Student(100, "Neha");
		students[1] = new Student(200, "Priya");
		students[2] = new Student(300, "Lahu");
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}

}
