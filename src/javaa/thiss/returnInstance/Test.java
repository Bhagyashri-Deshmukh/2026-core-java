package javaa.thiss.returnInstance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		Student st  = student.returnObject();
		st.setId(100);
		st.setName("Neha");
		
		System.out.println(st);
	}

}
