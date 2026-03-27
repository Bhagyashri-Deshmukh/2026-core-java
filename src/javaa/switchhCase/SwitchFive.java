package javaa.switchhCase;

public class SwitchFive {
	
	public enum Day{
		MON,TUE,WED,THUR,FRI,SAT,SUN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day [] days = Day.values();
		
		for(Day d : days) {
			
			switch(d) {
			
			case MON:
				System.out.println("Today is Monday!");
				break;
				
			case TUE:
				System.out.println("Today is Tuesday!");
				break;
				
			case WED:
				System.out.println("Today is Wednsday!");
				break;
				
			case THUR:
				System.out.println("Today is Thursday!");
				break;
				
			case FRI:
				System.out.println("Today is Friday!");
				break;
				
			case SAT:
				System.out.println("Today is Saturday!");
				break;
				
			case SUN:
				System.out.println("Today is Sunday!");
				break;
				
				default:
					System.out.println("Enter valid value!");
			}
		}
	}

}
