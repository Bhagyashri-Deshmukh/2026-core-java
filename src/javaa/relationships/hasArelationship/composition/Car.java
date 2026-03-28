package javaa.relationships.hasArelationship.composition;

public class Car {

	private String colour;
	private int maxSpeed;
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void carInfo() {
		System.out.println("Car colour is : "+colour+", max speed is : "+maxSpeed);
	}
}
