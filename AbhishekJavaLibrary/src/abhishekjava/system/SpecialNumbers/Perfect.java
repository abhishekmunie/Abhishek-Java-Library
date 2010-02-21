package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Perfect {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isPerfect()) {
												System.out.println("The number is a Perfect number.");
									} else {
												System.out.println("The number is not a Perfect number.");
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
			 * Checks that ihe number passed to it is a Perfect Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is perfect if the sum of its factors is equal to the number.
			 * @return
			 */
			public static boolean isPerfect() {
						int sum = 1;
						for (int i = 2; i <= (num / 2); i++) {
									if ((num % i) == 0) {
												sum += i;
									}
						}
						if (num == sum) {
									return true;
						} else {
									return false;
						}
			}
}
