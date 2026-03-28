package javaa.enums;

enum DayOne{
	
	SUNDAY,MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY;
}

class EnumTest{
	
	DayOne day;
	
	public EnumTest(DayOne day) {
		this.day=day;
	}
	
	public void howIsTheday() {
		
		switch(day) {
		
		case MONDAY:
			System.out.println("Tough");
			break;
			
		case TUESDAY:
			System.out.println("More tough");
			break;
			
		case WEDNSDAY:
			System.out.println("Better");
			break;
			
		case THURSDAY:
			System.out.println("More better");
			break;
			
		case FRIDAY:
			System.out.println("last working day");
			break;
			
			default:
				System.out.println("Worst");
		}
	}
}

public class EnumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest t1 = new EnumTest(DayOne.SATURDAY);
		t1.howIsTheday();
	}

}
