package javaa.objectCreationProcess.deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serialize();
		deserialize();
	}

	private static void deserialize() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student) ois.readObject();
			ois.close();
			fis.close();
			
			System.out.println("Deserialized object is : "+student);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void serialize() {
		// TODO Auto-generated method stub
		try {
			Student st = new Student(100, "Neha");
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.close();
			fos.close();
			
			System.out.println("Object has written to file!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
