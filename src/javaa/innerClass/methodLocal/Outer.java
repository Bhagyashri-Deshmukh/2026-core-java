package javaa.innerClass.methodLocal;

public class Outer {

	private int x =10;
	
	public void outerMethod() {
		
		int y =20;
		
		System.out.println("Inside outer method!");
		
		class Inner{
			
			int z =30;
			
			public void innerMethod() {
				System.out.println(z+" inside inner method! y: "+y+", x: "+x);
			}
		}
		
		Inner inner = new Inner();
		inner.innerMethod();
	}
}
