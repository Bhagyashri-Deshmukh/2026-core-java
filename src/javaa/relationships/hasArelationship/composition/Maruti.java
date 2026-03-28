package javaa.relationships.hasArelationship.composition;

public class Maruti extends Car{

	public void marutiDemo() {
		Engine engine = new Engine();
		
		engine.start();
		engine.stop();
	}
}
