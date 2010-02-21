package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Prime {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isPrime()) {
												System.out.println("The number is a Prime number.");
									} else {
												System.out.println("The number is not a Prime number.");
									}
									for (;;) {
												System.out.println();
												System.out.println("Do you want to continue? (yes/no)");
												String c = BR.readLine();
												System.out.println();
												if (c.equalsIgnoreCase("yes")) {
															break;
												} else if (c.equalsIgnoreCase("no")) {
															System.exit(0);
												} else {
															System.out.println("Invalid Entry.\n");
															continue;
												}
									}
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
			}

			/**
			 * Checks that ihe number passed to it is a Prime Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is prime if it has 1 and itself as its only factors.
			 * @return boolean value i.e. the no. is prime or not
			 */
			public static boolean isPrime() {
						if (num <= 1) {
									return false;
						}
						if (num == 2) {
									return true;
						}
						double limit = Math.ceil(Math.sqrt(num)) + 1;
						int j = 2;
						while (j < limit) {
									if (num % j == 0) {
												return false;
									}
									j++;
						}
						return true;
			}
}
