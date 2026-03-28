package javaa.relationships.hasArelationship.composition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.setColour("RED");
		car.setMaxSpeed(200);
		car.carInfo();
		
		Maruti maruti = new Maruti();
		maruti.marutiDemo();
	}

}
