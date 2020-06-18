package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Boolean fin = true;

		do {
			try {
				String in = String.valueOf(scan.nextInt());

				int z = 0;

				if (in.length() == 9) {

					for (int i = 0; i < 9; i++) {
						z = z + Integer.parseInt(String.valueOf(in.charAt(i)))*i;
					}
					int mod = z % 11;

					if (mod == 10) {
						System.out.print("The ISBN-10 number is: " + in + "X");
					} else {
						System.out.print("The ISBN-10 number is: " + in + mod);
					}
				} else {
					System.out.print("Enter the first 9 digits of an ISBN ONLY as integer: ");

				}
			} catch (InputMismatchException e) {
				System.out.print("Enter the first 9 digits of an ISBN ONLY as integer: ");
				scan.nextLine();
			}
		} while (fin);

	}

}
