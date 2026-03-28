package javaa.innerClass.staticInnerClass;

public class Outer {

	private static int x =10;
	
	static class Inner{
		
		public void display() {
			System.out.println("x is : "+x);
		}
	}
}
