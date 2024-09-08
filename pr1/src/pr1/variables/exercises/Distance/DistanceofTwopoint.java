package pr1.variables.exercises.Distance;

import java.util.Scanner;

public class DistanceofTwopoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Enter x2 and y2: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double DistanceofTwopoints = Math.pow((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)), 0.5);
		System.out.printf("The distance between two points is %.3f ", DistanceofTwopoints);
	}
}
