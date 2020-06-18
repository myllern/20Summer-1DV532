package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Boolean fin = true;
		System.out.print("Enter a three-digit integer number:");

		do {
			try {

				int a1 = scan.nextInt();
				int length = String.valueOf(a1).length();
				if (length == 3) {
					int x = a1 / 100;
					int y = a1 % 100 / 10;
					int z = a1 % 10;
					int sum = x + y + z;
					int multi = x * y * z;
					System.out.println("Sum of the digits of the integer number is: " + sum + "." + "\n"
							+ "Product of the digits of the integer number is: " + multi);
					fin = false;
				} else {
					System.out.println("Enter ONLY a three-digit integer number, please:");

				}

			} catch (InputMismatchException e) {
				System.out.println("Enter ONLY Enter a three-digit integer number, please:");
				scan.nextLine();
				System.out.println();

			}
		} while (fin);

	}
}
