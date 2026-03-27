package javaa.constructor.copy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(100, "Neha");
		
		System.out.println("Student 1 is : "+st1);
		
		Student st2 = new Student(st1);
		
		System.out.println("Student 2 is : "+st2);
	}

}
