package pr1.variables.exercises.Integer;

import java.util.Scanner;

public class IntegerDigitsSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = in.nextInt();
		int lessThan10 = number % 10;
		number /= 10;
		int tens = number % 10;
		number /= 10;
		int hundreds = number % 10;
		number /= 10;
		int sum = hundreds + tens + lessThan10;
		System.out.printf("The sum of the digits is %3s", sum);
	}
}
