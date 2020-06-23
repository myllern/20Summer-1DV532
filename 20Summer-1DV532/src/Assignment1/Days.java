package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Days {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Boolean cI = true;

		// present and future
		int x = 0;
		int y = 0;

		while (cI) {

			try {

				System.out.println("\n" + "Enter today's day: ");

				x = scan.nextInt();
				if (x < 0) {
					System.out.println("Only positive days...");
				} else {

					System.out.print("Enter the number for the future day: ");

					y = scan.nextInt();
					if (y <= x) {

						System.out.println("The future can not be in the past or in the present.....");

					} else {
						cI = false;

					}
				}

			} catch (InputMismatchException e) {
				System.out.println("Only input days as positive integers....");
				scan.nextLine();

			}
			scan.close();
		}

		int[] day = new int[2];
		day[0] = x % 7;
		day[1] = (y - x) % 7;

		String[] wD = new String[2];

		for (int i = 0; i < 2; i++) {

			switch (day[i]) {
			case 0:
				wD[i] = "Sunday";
				break;
			case 1:
				wD[i] = "Monday";
				break;
			case 2:
				wD[i] = "Tuesday";
				break;
			case 3:
				wD[i] = "Wednesday";
				break;
			case 4:
				wD[i] = "Thursday";
				break;
			case 5:
				wD[i] = "Friday";
				break;
			case 6:
				wD[i] = "Saturday";
				break;
			}

		}
		System.out.println("Today is " + wD[0] + " and the future day is " + wD[1] + ": ");
	}
}
