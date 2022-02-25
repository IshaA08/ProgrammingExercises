package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Isha Afzaal
 * Concept Being Practiced: Lambda Expressions
 * 
 * Concept Description: Lambda expressions are 'anonymous' functions; they are typically small blocks of code
 * that take in variable parameters and return some value. They do not require a name and
 * can be implemented in the code body when wanted.
 * 
 * Info: This class contains methods that each solve small problems using lambda expressions.
 * 		 The idea is to practice using the concept on practice problems.
 */

public class LambdaExpressions {
	
	/**
	 * Problem #1: Create a basic math calculator
	 */
		
	/* Method for taking the two numbers and specifying the operation to be done */
	public static int specifyOperation (int numOne, int numTwo, BasicMath calculator) {
		// Call the calculator's lambda expression
		return calculator.operation(numOne, numTwo);
	}
	
	/* Method for declaring and calling the basic math lambda expressions */
	public static int doOperation (int numOne, int numTwo, int chosenOperation) {
		// Create the lambda expressions for operations
		BasicMath add = (a, b) -> a + b;
		BasicMath subtract = (a, b) -> a - b;
		BasicMath multiply = (a, b) -> a * b;
		BasicMath divide = (a, b) -> a / b;
		
		// Invoking lambda expressions
		switch (chosenOperation) {
			case 1:
				return specifyOperation(numOne, numTwo, add);
			case 2:
				return specifyOperation(numOne, numTwo, subtract);
			case 3:
				return specifyOperation(numOne, numTwo, multiply);
			case 4:
				return specifyOperation(numOne, numTwo, divide);
			default:
				return 0;
		}
	}
	
	/**
	 * Problem #2: Sort a list by string length
	 */
	
	/**
	 * Problem #3: Display each element in a list
	 */
	public static void displayList(List<String> names) {
		// Use the Consumer interface to store a lambda expression
		Consumer<String> displayItem = e -> System.out.println(e);
		names.forEach(displayItem);
	}
}
