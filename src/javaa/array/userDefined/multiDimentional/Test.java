package javaa.array.userDefined.multiDimentional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [][] students = new Student[2][3];
		
		students[0][0] = new Student(100, "Neha");
		students[0][1] = new Student(200, "Pinki");
		students[0][2] = new Student(300, "Kirti");
		
		students[1][0] = new Student(400, "Shweta");
		students[1][1] = new Student(500, "Nikhil");
		students[1][2] = new Student(600, "Ram");
		
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<students[i].length;j++) {
				System.out.print(students[i][j].getName()+" ");
			}
			System.out.println();
		}
	}

}
