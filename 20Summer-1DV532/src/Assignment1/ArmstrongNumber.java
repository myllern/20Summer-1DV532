package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean fin = true;

		while (fin) {

			try {
				System.out.print("Enter the starting number of the range: ");
				int inLow = scan.nextInt();
				System.out.print("Enter the ending number of the range: ");
				int inHigh = scan.nextInt();
				int diff = inHigh - inLow;
				
				
				System.out.println("The  Armstrong numbers between the given range are : ");
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

			} catch (InputMismatchException e) {
				System.out.println();
				System.out.print("Numbers only...");
				System.out.println();
				scan.nextLine();
			}
			System.out.print("Do you want to repeat? (Y/N) :" + "\n");

			Boolean yNc = true;
			while (yNc) {
				try {

					String in = scan.next().toLowerCase();
					if (in.compareTo("n") == 0) {
						return;
					} else if (in.compareTo("n") != 11) {
						System.out.println("Only write Y or N.....");
					} else {
						yNc = false;
					}
				} catch (InputMismatchException e) {
					System.out.print("Only write Y or N.....");
				}
			}
		}
	}
}
