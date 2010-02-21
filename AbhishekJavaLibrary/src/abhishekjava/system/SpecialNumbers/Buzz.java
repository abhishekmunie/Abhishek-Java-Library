package abhishekjava.system.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Buzz {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isBuzz()) {
												System.out.println("The number is a Buzz number.");
									} else {
												System.out.println("The number is not a Buzz number.");
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
			 * Check weather the no. is a Buzz Number or not
			 * and returns the corresponding boolean value.<tr>
			 * A number is Buzz Number, when the number
			 * is either divisible by 7 or its last digit is 7.
			 * @return boolean value i.e. the no. is buzz or not
			 */
			public static boolean isBuzz() {
						return ((num % 7 == 0) || (num % 10 == 7));
			}
}