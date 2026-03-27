package javaa.objectCreationProcess.clone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(100, "Neha");
		
		try {
			Student st2 = (Student) st1.clone();
			System.out.println(st2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
