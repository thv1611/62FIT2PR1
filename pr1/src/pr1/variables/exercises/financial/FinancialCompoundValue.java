package pr1.variables.exercises.financial;

import java.util.Scanner;

public class FinancialCompoundValue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final double monthlyInterestRate = 0.00417;
		System.out.print("Enter a monthly saving amount: ");
		double savingAmount = in.nextDouble();;
		double accountValue = (1000000 * (1 + monthlyInterestRate));
		accountValue = ((1000000 + accountValue) * (1 + monthlyInterestRate));
		accountValue = ((1000000 + accountValue) * (1 + monthlyInterestRate));
		accountValue = ((1000000 + accountValue) * (1 + monthlyInterestRate));
		accountValue = ((1000000 + accountValue) * (1 + monthlyInterestRate));
		accountValue = ((1000000 + accountValue) * (1 + monthlyInterestRate));
		System.out.printf("After six months, the account value is %2f ", accountValue);
	}
	
}
