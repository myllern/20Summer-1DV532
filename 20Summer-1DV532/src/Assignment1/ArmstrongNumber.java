package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean fin = true;
		do {
			try {
				System.out.print("Enter the starting number of the range: ");
				int inLow = scan.nextInt();
				System.out.print("Enter the ending number of the range: ");
				int inHigh = scan.nextInt();
				int diff = inHigh - inLow;

				for (int i = 0; i < diff; i++) {
					int nrD = String.valueOf(inLow + i).length();
					String nrS = String.valueOf(inLow + i);
					int sum = 0;
					int temp = 0;
					for (int h = 0; h < nrD; h++) {
						sum = sum + ((int) Math.pow(Integer.parseInt(String.valueOf(nrS.charAt(h))), nrD));
						if (sum == Integer.parseInt(nrS)) {

							if (temp != sum) {
								System.out.println(sum);
								temp = sum;
							}
						}
					}
				}
				fin = true;
				System.out.print("Do you want to repeat? (Y/N) :");

				do {

					String yN = scan.nextLine();

					System.out.println();
					System.out.print("Can only read Y/N");
					System.out.println();

				} while (fin);

			} catch (InputMismatchException e) {
				System.out.println();
				System.out.print("Numbers only...");
				System.out.println();
				scan.nextLine();
			}
		} while (fin);
	}
}
