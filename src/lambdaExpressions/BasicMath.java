package lambdaExpressions;

/**
 * @author Isha Afzaal
 * User-defined functional interface for doing basic math lambda functions
 */

@FunctionalInterface
public interface BasicMath {

	/**
	 * {@summary Abstract method detailing lambda function template. 
	 * Any basic math operation will take two numbers and return the result
	 * of whatever operation the user asks for.}
	 */
	public int operation (int numOne, int numTwo);
}
