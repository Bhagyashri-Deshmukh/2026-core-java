package javaa.userDefinedExceptions.unchecked;

public class Arithmatic {

	public static void division(int a, int b) {
		
		if(b==0) {
			throw new CannotDivideByZeroException("Cannot devide a number by zero!");
		}
		
		int result = a/b;
		System.out.println("Result is : "+result);
	}
}
