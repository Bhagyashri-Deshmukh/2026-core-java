package javaa.objectCreationProcess.newInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Constructor<Student> cons = Student.class.getDeclaredConstructor();
		Student student = cons.newInstance();
		student.setId(100);
		student.setName("Neha");
		
		System.out.println(student.getId());
		System.out.println(student.getName());
	}

}
