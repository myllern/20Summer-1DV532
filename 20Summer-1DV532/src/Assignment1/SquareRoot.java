package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		SquareRoot sq = new SquareRoot();
		Scanner scan = new Scanner(System.in);
		System.out.println("This program estimate square roots.");
		System.out.println("");

		double initial = 0;
		Boolean fin = true;

		do {
			System.out.println("Enter an integer to estimate the square root of: ");
			try {

				initial = scan.nextInt();

				if (initial < 0) {
					System.out.println("Integer need to be possitive...");
				} else if (initial == 0) {

					System.out.print("The square root of 0.00 is 0.00");
					return;
				} else {
					fin = false;
				}
			} catch (InputMismatchException e) {
				System.out.print("Enter the first 9 digits of an ISBN ONLY as integer: ");
				scan.nextLine();
			}
		} while (fin);

		sq.sqrt(initial);
		scan.close();

	}

	public void sqrt(double n) {

		double initial = n;
		double guess = n / 2;
		double r = Double.MAX_VALUE;

		while (check(n, guess, initial)) {
			r = n / guess;
			guess = (guess + r) / 2;
			System.out.println("Current guess: " + guess);

		}

	}

	public boolean check(double n, double guess, double initial) {

		return (1 - (initial / Math.pow(guess, 2))) > 0.01;
	}

}
