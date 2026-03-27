package javaa.switchhCase;

public class SwitchFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =2;
		String branch = "CSE";
		
		switch(year) {
		
		case 1:
			System.out.println("All subjects are same for year 1 all branches!");
			break;
			
		case 2:
			switch(branch) {
			
			case "CSE":
				System.out.println("All CSE subjects!");
				break;
				
			case "ECE":
				System.out.println("All ECE subjects!");
				break;
				
				default:
					System.out.println("All subjects are same!");
			}
		
		}
	}

}
