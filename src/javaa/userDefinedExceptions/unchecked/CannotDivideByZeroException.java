package javaa.userDefinedExceptions.unchecked;

public class CannotDivideByZeroException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CannotDivideByZeroException(String message) {
		super(message);
	}
}
