package javaa.userDefinedExceptions.checked;

public class Person {

	public static void validate(int age) throws InvalidAgeException {
		
		if(age<18) {
			throw new InvalidAgeException("Age should be greater tahn 18!");
		}
		
		System.out.println("Age is : "+age);
	}
}
