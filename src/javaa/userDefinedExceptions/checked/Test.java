package javaa.userDefinedExceptions.checked;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Person.validate(17);
			
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
