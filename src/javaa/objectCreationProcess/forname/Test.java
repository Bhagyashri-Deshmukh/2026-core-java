package javaa.objectCreationProcess.forname;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student st = (Student) Class.forName("Student").newInstance();
			st.setId(100);
			st.setName("Neha");
			
			System.out.println(st.getId());
			System.out.println(st.getName());
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
