package javaa.thiss.invokeMethod;

public class Student {
	
	public void display() {
		System.out.println("This is display method in Student class!");
	}
	
	public void show() {
		System.out.println("This is show method in Student class!");
		
		this.display();
	}
}
