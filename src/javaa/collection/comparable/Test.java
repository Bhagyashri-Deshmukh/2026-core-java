package javaa.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(100, "Neha"));
		students.add(new Student(300, "Pinki"));
		students.add(new Student(200, "Kiran"));
		students.add(new Student(400, "Rahul"));
		
		Collections.sort(students);
		
		System.out.println(students);
	}

}
