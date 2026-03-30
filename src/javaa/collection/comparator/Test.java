package javaa.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(200, "Neha"));
		students.add(new Student(400, "Alisa"));
		students.add(new Student(100, "Chetna"));
		students.add(new Student(300, "Bhavana"));
		
		System.out.println("students before sorting : ");
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		Collections.sort(students, new StudentCompareByName());
		
		System.out.println("\nstudents after sorting : ");
		
		for(Student s : students) {
			System.out.println(s);
		}
		
	}

}
