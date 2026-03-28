package javaa.enums;

enum Color{
	
	RED,GREEN,YELLOW,BLACK;
}

public class EnumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c = Color.BLACK;
		
		switch(c) {
		
		case RED:
			System.out.println("RED");
			break;
			
		case GREEN:
			System.out.println("GREEN");
			break;
			
		case YELLOW:
			System.out.println("YELLOW");
			break;
			
		case BLACK:
			System.out.println("BLACK");
			break;
		}
	}

}
