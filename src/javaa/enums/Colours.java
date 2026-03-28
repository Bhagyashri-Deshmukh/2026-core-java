package javaa.enums;

public enum Colours {

	RED,BLACK,GREEN;
	
	private Colours() {
		System.out.println("This is constructor for colours : "+this);
	}
	
	public void display() {
		System.out.println("Colour is : "+this);
	}
}
