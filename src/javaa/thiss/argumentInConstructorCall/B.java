package javaa.thiss.argumentInConstructorCall;

public class B {

	int x =10;
	
	public B() {
		A a = new A(this);
	}
	
	public void dispaly() {
		System.out.println("value of x is : "+x);
	}
}
