package javaa.switchhCase;

public class SwitchSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		
		switch(x+1) {
		
		case 1: 
			System.out.println("1");
			break;
			
		case 1+1:
			System.out.println("2");
			break;
			
		case 2+1:// case label cannot be variable, here we cannot use x or y
			System.out.println("3");
			break;
		
		}
	}

}
